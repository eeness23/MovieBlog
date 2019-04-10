package com.enes.intern.service;

import com.enes.intern.model.Cast;
import com.enes.intern.repository.CastRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastService {

    private CastRepository castRepository;

    public CastService(CastRepository castRepository) {
        this.castRepository = castRepository;
    }

    public Cast save(Cast cast){
      return castRepository.save(cast);
    }

    public List<Cast> findAllByOOrderByNameAsc(){return castRepository.findAllByOrderByNameAsc();}

    public Cast findById(Long id){ return castRepository.findById(id).get();}

    public void deleteById(Long id) {
     castRepository.deleteById(id);
    }

    public List<Cast> getCastBySearchName(String name){return castRepository.getCastBySearchName(name);}
}
