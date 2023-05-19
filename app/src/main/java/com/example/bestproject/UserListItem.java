package com.example.bestproject;


import android.widget.ImageButton;
import android.widget.ImageView;

public class UserListItem {
    //поля сущности
    private int account;
    private int imageView;
    private String name;


    public UserListItem(int account, int imageView, String name) {
        this.account = account;
        this.imageView = imageView;
        this.name = name;

    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
