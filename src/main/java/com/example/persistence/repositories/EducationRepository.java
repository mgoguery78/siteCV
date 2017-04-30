package com.example.persistence.repositories;

import com.example.persistence.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public interface EducationRepository extends JpaRepository<Education, Integer> {

}
