package com.enes.intern.service;

import com.enes.intern.model.Collection;
import com.enes.intern.repository.CollectionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CollectionService {
    private final CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public Collection save(Collection collection){ return collectionRepository.save(collection);}

    public List<Collection> findAll(){return collectionRepository.findAll();}

    public Collection findById(Long id){return collectionRepository.findById(id).get();}
    public void deleteById(Long id){collectionRepository.deleteById(id);}

    public List<Collection> getCollectionByUserId(Long id){
        return collectionRepository.getCollectionByUserId(id);
    }
    public List<Collection> getCollectionByMovieId(Long id){
        return collectionRepository.getCollectionByMovieId(id);
    }
}
