package com.quangtrong.mp.model;

/**
 *
 * @author NgoQuang
 */
public class Tracking {
    
    private String trackingID;
    
    private String packageID;
    
    private String date;
    
    private String postOfficeID;
    
    private String postOfficeAddress;
    
    private String status;
    
    private String statusID;
    
    private String time;

    public Tracking() {
    }

    public Tracking(String trackingID, String packageID, String date, String postOfficeID, String statusID, String time) {
        this.trackingID = trackingID;
        this.packageID = packageID;
        this.date = date;
        this.postOfficeID = postOfficeID;
        this.statusID = statusID;
        this.time = time;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPostOfficeID() {
        return postOfficeID;
    }

    public void setPostOfficeID(String postOfficeID) {
        this.postOfficeID = postOfficeID;
    }

    public String getPostOfficeAddress() {
        return postOfficeAddress;
    }

    public void setPostOfficeAddress(String postOfficeAddress) {
        this.postOfficeAddress = postOfficeAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

}
