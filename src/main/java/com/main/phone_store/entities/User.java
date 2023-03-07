package com.main.phone_store.entities;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_ID")
    private Integer userID;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
    @Column(name="user_Name")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name="name")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Column(name="email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name="password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name="address")
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    @Column(name="phone")
    private Integer phone;

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    @Column(name="access_Level")
    private boolean accessLevel;

    public boolean isAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(boolean accessLevel) {
        this.accessLevel = accessLevel;
    }
}
