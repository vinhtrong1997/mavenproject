package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Location {
    
    private String locationID;
    private String cityID;

    public Location() {
    }

    public Location(String locationID, String cityID) {
        this.locationID = locationID;
        this.cityID = cityID;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }
    
    
}
