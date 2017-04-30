package com.example.services;

import com.example.persistence.entities.TaskList;
import com.example.persistence.repositories.TaskListRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
public class TaskListService {
    @Resource
    private TaskListRepository taskListRepository;

    public List<TaskList> getTaskListForExperience(int experienceId) {
        return taskListRepository.findByExperienceID(experienceId);
    }
}
