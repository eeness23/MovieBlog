package com.enes.intern.service;

import com.enes.intern.model.Image;
import com.enes.intern.model.Movie;
import com.enes.intern.repository.ImageRepository;

import org.springframework.core.io.Resource;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class ImageService {

    private static String upload_root = "src\\main\\resources\\static\\images";

    private ImageRepository imageRepository;
    private ResourceLoader resourceLoader;
    private MovieService movieService;

    public ImageService(ImageRepository imageRepository, ResourceLoader resourceLoader, MovieService movieService) {
        this.imageRepository = imageRepository;
        this.resourceLoader = resourceLoader;
        this.movieService = movieService;
    }

    public Resource findOneImage(String fileName){
       return resourceLoader.getResource("file:" + upload_root + fileName);
    }

    public void saveImage(MultipartFile multipartFile,Long id) throws IOException{
        if(!multipartFile.isEmpty()){

            //Generate random file name for security

            String filename = UUID.randomUUID().toString();
            while(imageRepository.existsByName(filename)){
                filename = UUID.randomUUID().toString();
            }

            System.out.println();
            System.out.println(multipartFile.getOriginalFilename());
            System.out.println(multipartFile.getResource().getFilename());
            System.out.println(multipartFile.getResource().getFilename());

          // taking file extension and u can check it  example : if(extension == jpg) ...
            String extension = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")+1);

            Files.copy(multipartFile.getInputStream(), Paths.get(upload_root,filename + "."+ extension));
            Image temp =new Image(filename+"."+extension);

            imageRepository.save(temp);
            Movie movie = movieService.findById(id);
            movie.setImage(temp);
            movieService.save(movie);
        }
    }

    public void deleteImage(String fileName) throws IOException{
        final Image image = imageRepository.findByName(fileName);
        imageRepository.delete(image);
        Files.deleteIfExists(Paths.get(upload_root,fileName));
    }

}
