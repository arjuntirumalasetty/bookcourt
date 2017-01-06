package com.findsport.DataObjects;

/**
 * Created by Arjun on 12/30/2016.
 */
public class StadiumAddress {
    private String streetName;
    private String cityName;
    private String landMark;
    private String state;
    private String country;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String street_name) {
        this.streetName= street_name;
    }

    public String getCityname() {
        return cityName;
    }

    public void setCityName(String city_name) {
        this.cityName = city_name;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLand_mark(String land_mark) {
        this.landMark = land_mark;
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
