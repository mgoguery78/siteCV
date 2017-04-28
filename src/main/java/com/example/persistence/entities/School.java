package com.example.persistence.entities;

import javax.persistence.*;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="School", schema="", catalog = "CV")
public class School {
    private int id;
    private String name;
    private String link;
    private int localisationId;

    public School() {}

    public School(int id, String name, String link, int localisationId) {
        this.id = id;
        this.name = name;
        this.link = link;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name="link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
