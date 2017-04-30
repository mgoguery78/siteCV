package com.example.persistence.repositories;

import com.example.persistence.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public interface TaskListRepository extends JpaRepository<TaskList, Integer> {
    List<TaskList> findByExperienceID(@Param("experienceID") int experienceId);
}
