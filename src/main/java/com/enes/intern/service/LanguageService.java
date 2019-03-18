package com.enes.intern.service;

import com.enes.intern.model.Language;
import com.enes.intern.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LanguageService {
    private LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Transactional
    public Language save(Language language){
        return languageRepository.save(language);
    }

    public List<Language> getAll(){return languageRepository.getAll();}

    public Language findById(Long id){return languageRepository.findById(id).get();}
    public Language findByName(String name){
        return languageRepository.findByName(name).get();
    }

    public void deleteById(Long id){languageRepository.deleteById(id);}
}
