package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class NationalCity {
    
    private String cityID;
    private String cityName;

    public NationalCity() {
    }

    public NationalCity(String cityID, String cityName) {
        this.cityID = cityID.trim();
        this.cityName = cityName;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
}
