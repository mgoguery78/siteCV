package com.example.services;

import com.example.persistence.entities.Diverse;
import com.example.persistence.repositories.DiverseRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class DiverseService {
    @Resource
    private DiverseRepository diverseRepository;

    public List<Diverse> getAllDiverses () {
        return diverseRepository.findAll();
    }
}
