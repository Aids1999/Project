package com.example.bestproject;

import java.io.Serializable;

public class User implements Serializable {

    private String Nickname;
    private String PhoneNum;
    private String Password;

    public User(String nickname, String phoneNum, String password) {
        Nickname = nickname;
        PhoneNum = phoneNum;
        Password = password;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
