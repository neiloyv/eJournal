package com.neiloyv.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTS")
public class Client {


    @Id
    @Column(name = "CLIENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientId;

    @Column(name = "CLIENT_SURNAME")
    private String clientSurname;


    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "CLIENT_BIRTHDAY", nullable = false)
    private Date clientBirthday;

    @Column(name = "CLIENT_PARENT1")
    private String clientParent1;

    @Column(name = "CLIENT_PHONE1")
    private String clientParentPhone1;

    @Column(name = "CLIENT_PARENT2")
    private String clientParent2;

    @Column(name = "CLIENT_PHONE2")
    private String clientParentPhone2;

    @Column(name = "CLIENT_CLASS")
    private String clientClass;

    @Column(name = "CLIENT_STATUS")
    private String clientStatus;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(Date clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public String getClientParent1() {
        return clientParent1;
    }

    public void setClientParent1(String clientParent1) {
        this.clientParent1 = clientParent1;
    }

    public String getClientParentPhone1() {
        return clientParentPhone1;
    }

    public void setClientParentPhone1(String clientParentPhone1) {
        this.clientParentPhone1 = clientParentPhone1;
    }

    public String getClientParent2() {
        return clientParent2;
    }

    public void setClientParent2(String clientParent2) {
        this.clientParent2 = clientParent2;
    }

    public String getClientParentPhone2() {
        return clientParentPhone2;
    }

    public void setClientParentPhone2(String clientParentPhone2) {
        this.clientParentPhone2 = clientParentPhone2;
    }

    public String getClientClass() {
        return clientClass;
    }

    public void setClientClass(String clientClass) {
        this.clientClass = clientClass;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + clientId +
                ", Surname='" + clientSurname + '\'' +
                ", Name='" + clientName + '\'' +
                ", Birthday=" + clientBirthday +
                ", Parent1='" + clientParent1 + '\'' +
                ", ParentPhone1='" + clientParentPhone1 + '\'' +
                ", Parent2='" + clientParent2 + '\'' +
                ", ParentPhone2='" + clientParentPhone2 + '\'' +
                ", Class='" + clientClass + '\'' +
                ", Status='" + clientStatus + '\'' +
                '}';
    }
}
