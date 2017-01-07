package com.findsport.DataObjects;

/**
 * Created by Arjun on 12/26/2016.
 */
public class Stadium {
    private int stadiumID;
    private float stadiumLongitude;
    private float stadiumLatitude;
    private String stadiumName;
    private String stadiumPhoneNo;
    private String streetName;
    private String cityName;
    private String landMark;
    private String state;
    private String country;

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setStadiumLongitude(float stadiumLongitude) {
        this.stadiumLongitude = stadiumLongitude;
    }

    public void setStadiumLatitude(float stadiumLatitude) {
        this.stadiumLatitude = stadiumLatitude;
    }

    public void setStadiumPhoneNo(String stadiumPhoneNo) {
        this.stadiumPhoneNo = stadiumPhoneNo;
    }


    public int getStadiumID() {
        return stadiumID;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public float getStadiumLongitude() {
        return stadiumLongitude;
    }

    public float getStadiumLatitude() {
        return stadiumLatitude;
    }

    public String getStadiumPhoneNo() {
        return stadiumPhoneNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
