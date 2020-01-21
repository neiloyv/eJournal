package com.neiloyv.model;

import javax.persistence.*;

@Entity
@Table(name = "GROUPS")
public class Group {

    @Id
    @Column(name = "GROUPS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "GROUPS_TITLE")
    private String title;

    @Transient
    private int pp;

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
