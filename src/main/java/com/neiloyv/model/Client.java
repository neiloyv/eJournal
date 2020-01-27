//package com.neiloyv.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "CLIENTS")
//public class Client {
//
//
//    @Id
//    @Column(name = "CLIENTS_ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "CLIENTS_SURNAME")
//    private String surname;
//
//
//    @Column(name = "CLIENTS_NAME")
//    private String name;
//
//    @Column(name = "CLIENTS_BIRTHDAY")
//    private String birthday;
//
//    @Column(name = "CLIENTS_PARENT")
//    private String parent;
//
//    @Column(name = "CLIENTS_PHONE")
//    private String phone;
//
//    @Column(name = "CLIENTS_GROUP")
//    private String group;
//
//    @Transient
//    private int pp;
//
//    public int getPp() {
//        return pp;
//    }
//
//    public void setPp(int pp) {
//        this.pp = pp;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getParent() {
//        return parent;
//    }
//
//    public void setParent(String parent) {
//        this.parent = parent;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    @Override
//    public String toString() {
//        return "Client{" +
//                "Id=" + id +
//                ", Surname='" + surname + '\'' +
//                ", Name='" + name + '\'' +
//                ", Birthday=" + birthday +
//                ", Parent1='" + parent + '\'' +
//                ", ParentPhone1='" + phone + '\'' +
//                ", Class='" + group + '\'' +
//                '}';
//    }
//}
