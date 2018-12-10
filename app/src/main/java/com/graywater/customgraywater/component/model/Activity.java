package com.graywater.customgraywater.component.model;



public class Activity {
    private int image;
    private String info;
    private int rating;
    private int totalReviews;

    public Activity(int image, String info, int rating, int totalReviews) {
        this.image = image;
        this.info = info;
        this.rating = rating;
        this.totalReviews = totalReviews;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }
}
