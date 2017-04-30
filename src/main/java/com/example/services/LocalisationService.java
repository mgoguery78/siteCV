package com.example.services;

import com.example.persistence.entities.Localisation;
import com.example.persistence.repositories.LocalisationRepository;

import javax.annotation.Resource;

/**
 * Created by zoe on 30/04/2017.
 */
public class LocalisationService {
    @Resource
    private LocalisationRepository localisationRepository;

    public Localisation getLocalisationById(int id) {
        return localisationRepository.findOne(id);
    }
}
