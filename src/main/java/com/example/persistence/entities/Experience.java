package com.example.persistence.entities;

import javax.persistence.*;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Experience", schema="", catalog = "CV")
public class Experience {
    private int id;
    private String company;
    private String duration;
    private String startDate;
    private String endDate;
    private String label;
    private int localisationId;

    public Experience() {}

    public Experience(int id, String company, String duration, String startDate, String endDate, String label, int localisationId) {
        this.id = id;
        this.company = company;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
        this.label = label;
        this.localisationId = localisationId;
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
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "start_date")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
    @Column(name = "localisation_id")
    public int getLocalisationId() {
        return localisationId;
    }

    public void setLocalisationId(int localisationId) {
        this.localisationId = localisationId;
    }
}
