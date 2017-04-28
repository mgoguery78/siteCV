package com.example.persistence.entities;

import javax.persistence.*;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Education", schema="", catalog = "CV")
public class Education {
    private int id;
    private String name;
    private String field;
    private String startDate;
    private String endDate;
    private int schoolId;

    public Education() {}

    public Education(int id, String name, String field, String startDate, String endDate, int schoolId) {
        this.id = id;
        this.name = name;
        this.field = field;
        this.startDate = startDate;
        this.endDate = endDate;
        this.schoolId = schoolId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
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
    @Column(name="end_date")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name="school_id")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
}
