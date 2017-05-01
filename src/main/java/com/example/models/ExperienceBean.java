package com.example.models;

import com.example.persistence.entities.Experience;
import com.example.persistence.entities.Localisation;
import com.example.persistence.entities.TaskList;

import java.util.List;

/**
 * Created by zoe on 01/05/2017.
 */
public class ExperienceBean {
    private Experience experience;
    private List<TaskList> taskList;
    private Localisation localisation;

    public ExperienceBean(Experience experience, List<TaskList> taskList, Localisation localisation){
        this.experience = experience;
        this.taskList = taskList;
        this.localisation = localisation;
    }

    public ExperienceBean(Experience experience) {
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    public List<TaskList> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskList> taskList) {
        this.taskList = taskList;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
}
