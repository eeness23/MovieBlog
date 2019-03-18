package com.enes.intern.service;

import com.enes.intern.model.Setting;
import com.enes.intern.repository.SettingRepository;
import org.springframework.stereotype.Service;

@Service
public class SettingService {

    private SettingRepository settingRepository;

    public SettingService(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    public Setting save(Setting setting){
        return settingRepository.save(setting);
    }
}
