package com.findsport.DataObjects;

/**
 * Created by Arjun on 12/26/2016.
 */
public class Stadium {

    private int stadiumID;
    private float stadiumLongitude;
    private float stadiumLatitude;
    private String stadiumPhoneNo;
    private String stadiumName;

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

}
