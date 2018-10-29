package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class District {
    
    private String districID;
    private String districtName;
    private String cityID;

    public District() {
    }

    public District(String districID, String districtName, String cityID) {
        this.districID = districID;
        this.districtName = districtName;
        this.cityID = cityID;
    }

    public String getDistricID() {
        return districID;
    }

    public void setDistricID(String districID) {
        this.districID = districID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }
    
    
}
