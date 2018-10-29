package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Sender {
    private String senderID;
    private String fullname;
    private String mobilePhone;
    private String locationID;
    private String CMNDNo;

    public Sender() {
    }

    public Sender(String senderID, String fullname, String mobilePhone, String locationID, String CMNDNo) {
        this.senderID = senderID;
        this.fullname = fullname;
        this.mobilePhone = mobilePhone;
        this.locationID = locationID;
        this.CMNDNo = CMNDNo;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getCMNDNo() {
        return CMNDNo;
    }

    public void setCMNDNo(String CMNDNo) {
        this.CMNDNo = CMNDNo;
    }
    
    
}
