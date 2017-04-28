package com.example.persistence.entities;

import javax.persistence.*;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Diverse_Sections", schema="", catalog = "CV")
public class Diverse {
    private int id;
    private String title;
    private String subtitle;
    private String comment;

    public Diverse() {}

    public Diverse(int id, String title, String subtitle, String comment) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.comment = comment;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
