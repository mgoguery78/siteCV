package com.example.services;

import com.example.persistence.entities.Programming;
import com.example.persistence.repositories.ProgrammingRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class ProgrammingService {
    @Resource
    private ProgrammingRepository programmingRepository;

    public List<Programming> getAllProgramming() {
        return programmingRepository.findAll();
    }
}
