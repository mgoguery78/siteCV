package com.example.persistence.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zoe on 28/04/2017.
 */
@Entity
@Table(name="Languages", schema="", catalog = "siteCV")
public class Languages {
    private String name;
    private String level;
    private String comment;

    public Languages() {}

    public Languages(String name, String level, String comment) {
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
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
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
