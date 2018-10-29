package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class PostOffice {
    private String postOfficeID;
    private String locationID;
    private String staffID;
    private String postOfficeName;
    private String serviceID;

    public PostOffice() {
    }

    public PostOffice(String postOfficeID, String locationID, String staffID, String postOfficeName, String serviceID) {
        this.postOfficeID = postOfficeID;
        this.locationID = locationID;
        this.staffID = staffID;
        this.postOfficeName = postOfficeName;
        this.serviceID = serviceID;
    }

    public String getPostOfficeID() {
        return postOfficeID;
    }

    public void setPostOfficeID(String postOfficeID) {
        this.postOfficeID = postOfficeID;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getPostOfficeName() {
        return postOfficeName;
    }

    public void setPostOfficeName(String postOfficeName) {
        this.postOfficeName = postOfficeName;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }
    
    
}
