package com.example.services;

import com.example.persistence.entities.School;
import com.example.persistence.repositories.SchoolRepository;

import javax.annotation.Resource;

/**
 * Created by zoe on 30/04/2017.
 */
public class SchoolService {
    @Resource
    private SchoolRepository schoolRepository;

    public School getSchoolById(int id) {
        return schoolRepository.findOne(id);
    }
}
