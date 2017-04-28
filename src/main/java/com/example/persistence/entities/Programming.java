package com.example.persistence.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Programming", schema="", catalog = "siteCV")
public class Programming {
    private String name;
    private int level;
    private String comment;

    public Programming(){}

    public Programming(String name, int level, String comment) {
        this.name = name;
        this.level = level;
        this.comment = comment;
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
    @Column(name="level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
