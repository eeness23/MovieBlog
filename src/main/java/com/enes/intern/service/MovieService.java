package com.enes.intern.service;


import com.enes.intern.model.Image;
import com.enes.intern.model.Movie;
import com.enes.intern.repository.MovieRepository;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.util.List;

@Service
@Transactional
public class MovieService {

    private static final String upload_root = "src\\main\\resources\\static\\movieImage";

    private final ImageService imageService;
    private final MovieRepository movieRepository;

    public MovieService(ImageService imageService, MovieRepository movieRepository) {
        this.imageService = imageService;
        this.movieRepository = movieRepository;
    }

    @Transactional
    public Movie save(Movie movie){
        Movie dbMovie =movieRepository.save(movie);
        if(dbMovie!=null && movie.getImage()!=null && movie.getImage().getSize()>0) {
            MultipartFile file = movie.getImage();
            String fileName = file.getOriginalFilename();
            // for Security
            String modifiedFileName = FilenameUtils.getBaseName(fileName) + "_" + System.currentTimeMillis() + "." + FilenameUtils.getExtension(fileName);
            File storeFile = new File(upload_root + File.separator + modifiedFileName);
            if (storeFile != null) {
                try {
                    FileUtils.writeByteArrayToFile(storeFile, file.getBytes());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dbMovie.setImageName(modifiedFileName);

            Image image = new Image();
            image.setName(fileName);
            image.setModifiedFileName(modifiedFileName);
            image.setFileExtension(FilenameUtils.getExtension(fileName));
            image.setMovie(dbMovie);
            imageService.save(image);

        }
            return dbMovie;
    }

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }
    public Page<Movie> getPages(int page,int size){
        return movieRepository.findAll(PageRequest.of(page,size,Sort.by("name")));
    }

    public Page<Movie> getPagesWithSort(int page,int size){
        return movieRepository.findAll(PageRequest.of(page,size,Sort.by("date")));
    }

    public Movie findById(Long id){return movieRepository.findById(id).get();}

    public void deleteById(Long id){
         imageService.deleteByMovieId(id);
         movieRepository.deleteById(id);
    }

    public List<Movie> getRandomMovies(){
        return movieRepository.getRandomMovie();
    }

}
