package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Receiver {
    private String receiverID;
    private String fullname;
    private String mobilePhone;
    private String locationID;
    private String CMNDNo;

    public Receiver() {
    }

    public Receiver(String receiverID, String fullname, String mobilePhone, String locationID, String CMNDNo) {
        this.receiverID = receiverID;
        this.fullname = fullname;
        this.mobilePhone = mobilePhone;
        this.locationID = locationID;
        this.CMNDNo = CMNDNo;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
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
