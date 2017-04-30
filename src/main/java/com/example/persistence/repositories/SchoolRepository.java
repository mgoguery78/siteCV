package com.example.persistence.repositories;

import com.example.persistence.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
