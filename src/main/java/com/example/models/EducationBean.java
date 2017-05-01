package com.example.models;

import com.example.persistence.entities.Education;
import com.example.persistence.entities.Localisation;
import com.example.persistence.entities.School;

/**
 * Created by zoe on 01/05/2017.
 */
public class EducationBean {
    private Education education;
    private School school;
    private Localisation localisation;

    public EducationBean(Education education) {
        this.education = education;
    }

    public EducationBean(Education education, School school, Localisation localisation) {
        this.education = education;
        this.school = school;
        this.localisation = localisation;
    }

    public Education getEducation() {
        return education;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
}
