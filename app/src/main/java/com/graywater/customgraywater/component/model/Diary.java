package com.graywater.customgraywater.component.model;


public class Diary implements BaseModel {
    private int image;
    private int profileImage;
    private String name;
    private String location;
    private String caption;

    public Diary(int image, int profileImage, String name, String location, String caption) {
        this.image = image;
        this.profileImage = profileImage;
        this.name = name;
        this.location = location;
        this.caption = caption;
    }

    public int getImage() {
        return image;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCaption() {
        return caption;
    }
}
