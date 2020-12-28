package com.registration.demo.controller;

import java.util.Arrays;

public class UserRegistration {
    private String UName;
    private String EmailId;
    private String Password;
    private byte Gender;
    private byte Position;

    public UserRegistration() {

    }

    public UserRegistration(String UName, String emailId, String password, byte gender, byte position) {
        this.UName = UName;
        EmailId = emailId;
        Password = password;
        Gender = gender;
        Position = position;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public byte getGender() {
        return Gender;
    }

    public void setGender(byte gender) {
        Gender = gender;
    }

    public byte getPosition() {
        return Position;
    }

    public void setPosition(byte position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "UName='" + UName + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender=" + Gender +
                ", Position=" + Position +
                '}';
    }
}



