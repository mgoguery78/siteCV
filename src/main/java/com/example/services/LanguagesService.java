package com.example.services;

import com.example.persistence.entities.Languages;
import com.example.persistence.repositories.LanguagesRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class LanguagesService {
    @Resource
    private LanguagesRepository languagesRepository;

    public List<Languages> getAllLanguages() {
        return languagesRepository.findAll();
    }
}
