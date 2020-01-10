package com.neiloyv.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTS")
public class Client {


    @Id
    @Column(name = "CLIENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CLIENT_SURNAME")
    private String surname;


    @Column(name = "CLIENT_NAME")
    private String name;

    @Column(name = "CLIENT_BIRTHDAY", nullable = false)
    private Date birthday;

    @Column(name = "CLIENT_PARENT1")
    private String parent1;

    @Column(name = "CLIENT_PHONE1")
    private String phone1;

    @Column(name = "CLIENT_PARENT2")
    private String parent2;

    @Column(name = "CLIENT_PHONE2")
    private String phone2;

    @Column(name = "CLIENT_CLASS")
    private String group;

    @Column(name = "CLIENT_STATUS")
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getParent1() {
        return parent1;
    }

    public void setParent1(String parent1) {
        this.parent1 = parent1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getParent2() {
        return parent2;
    }

    public void setParent2(String parent2) {
        this.parent2 = parent2;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + id +
                ", Surname='" + surname + '\'' +
                ", Name='" + name + '\'' +
                ", Birthday=" + birthday +
                ", Parent1='" + parent1 + '\'' +
                ", ParentPhone1='" + phone1 + '\'' +
                ", Parent2='" + parent2 + '\'' +
                ", ParentPhone2='" + phone2 + '\'' +
                ", Class='" + group + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}
