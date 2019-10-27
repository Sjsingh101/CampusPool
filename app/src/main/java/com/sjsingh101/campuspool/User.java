package com.sjsingh101.campuspool;

public class User {
    private String Name;
    private int Rating ;
    private String location ;
    private int Thumbnail ;

    public String getName() {
        return Name;
    }

    public User(String name, int rating, String location, int thumbnail) {
        Name = name;
        Rating = rating;
        this.location = location;
        Thumbnail = thumbnail;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
