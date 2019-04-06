package com.enes.intern.service;

import com.enes.intern.model.Category;
import com.enes.intern.model.Movie;
import com.enes.intern.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> findAll(){return categoryRepository.findAll();}

    public Category findById(Long id){return categoryRepository.findById(id).get();}

    public void deleteById(Long id ){categoryRepository.deleteById(id);}

    public List<Movie> getMoviesByCategoryId(long id){
        return categoryRepository.getMoviesByCategoryId(id);
    }


}
