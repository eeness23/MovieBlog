package com.enes.intern.service;

import com.enes.intern.model.Image;

import com.enes.intern.repository.ImageRepository;


import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;



import java.io.File;
import java.util.List;

@Service
public class ImageService {

    private static final String upload_root = "src\\main\\resources\\static\\movieImage";

    private ImageRepository imageRepository;
    private ResourceLoader resourceLoader;

    public ImageService(ImageRepository imageRepository, ResourceLoader resourceLoader) {
        this.imageRepository = imageRepository;
        this.resourceLoader = resourceLoader;
    }

    public List<Image> findAll(){
        return imageRepository.findAll();
    }
    public void save(Image Image) { imageRepository.save(Image);}

    public Image findImageByMovieId(Long id) {
        return imageRepository.findImageByMovieId(id);
    }

    public void deleteByMovieId(Long id) {
        Image Image = findImageByMovieId(id);
        File file = new File(upload_root+File.separator+Image.getModifiedFileName());

        if(file.delete()){
            System.out.println(file.getName() + " is deleted!");
        }else{
            System.out.println("Delete operation is failed.");
        }
        imageRepository.deleteById(Image.getId());
    }

}
