package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Sender {
    private String senderID;
    private String fullname;
    private String mobilePhone;
    private String address;
    private String CMNDNo;

    public Sender() {
    }

    public Sender(String senderID, String fullname, String mobilePhone, String address, String CMNDNo) {
        this.senderID = senderID;
        this.fullname = fullname;
        this.mobilePhone = mobilePhone;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getCMNDNo() {
        return CMNDNo;
    }

    public void setCMNDNo(String CMNDNo) {
        this.CMNDNo = CMNDNo;
    }
    
    
}
