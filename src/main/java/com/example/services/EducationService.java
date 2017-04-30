package com.example.services;

import com.example.persistence.entities.Education;
import com.example.persistence.repositories.EducationRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class EducationService {
    @Resource
    private EducationRepository educationRepository;

    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }
}
