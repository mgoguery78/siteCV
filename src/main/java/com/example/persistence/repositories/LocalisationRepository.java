package com.example.persistence.repositories;

import com.example.persistence.entities.Localisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


/**
 * Created by zoe on 30/04/2017.
 */
public interface LocalisationRepository extends JpaRepository<Localisation, Integer>{

}
