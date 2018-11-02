package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class InternationalCity {
    
    private String cityID;
    private String cityName;

    public InternationalCity() {
    }

    public InternationalCity(String cityID, String cityName) {
        this.cityID = cityID;
        this.cityName = cityName;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
}
