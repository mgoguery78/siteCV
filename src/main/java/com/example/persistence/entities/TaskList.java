package com.example.persistence.entities;

import javax.persistence.*;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Task_List", schema="", catalog = "siteCV")
public class TaskList {
    private int id;
    private String label;
    private int experienceID;

    public TaskList() {}

    public TaskList(int id, String label, int experienceID) {
        this.id = id;
        this.label = label;
        this.experienceID = experienceID;
    }

    @Id
    @Basic
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "experience_id")
    public int getExperienceID() {
        return experienceID;
    }

    public void setExperienceID(int experienceID) {
        this.experienceID = experienceID;
    }
}
