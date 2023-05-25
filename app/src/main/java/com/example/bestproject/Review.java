package com.example.bestproject;

public class Review {
    private String name;
    private int avatarResource;
    private String reviewText;

    public Review(String name, int avatarResource, String reviewText) {
        this.name = name;
        this.reviewText = reviewText;
        this.avatarResource = avatarResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
