package com.example.services;

import com.example.persistence.entities.Experience;
import com.example.persistence.repositories.ExperienceRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class ExperienceService {
    @Resource
    private ExperienceRepository experienceRepository;

    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }
}
