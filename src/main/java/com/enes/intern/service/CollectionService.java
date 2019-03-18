package com.enes.intern.service;

import com.enes.intern.model.Collection;
import com.enes.intern.repository.CollectionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CollectionService {
    private CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public Collection save(Collection collection){ return collectionRepository.save(collection);}

    public List<Collection> getAll(){return collectionRepository.getAll();}

    public Collection findById(Long id){return collectionRepository.findById(id).get();}
    public void deleteById(Long id){collectionRepository.deleteById(id);}
}
