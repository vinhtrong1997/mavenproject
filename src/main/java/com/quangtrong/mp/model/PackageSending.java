package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class PackageSending {
    
    private String packageID;
    private Float weight;
    private String senderID;
    private String receiverID;
    private String srcPostOfficeID;
    private String desPostOfficeID;
    private String statusID;
    private String date;
    private String serviceID;
    private Float totalFee;

    public PackageSending() {
    }

    public PackageSending(String packageID, Float weight, String senderID, String receiverID, String srcPostOfficeID, String desPostOfficeID, String statusID, String date, String serviceID, Float totalFee) {
        this.packageID = packageID;
        this.weight = weight;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.srcPostOfficeID = srcPostOfficeID;
        this.desPostOfficeID = desPostOfficeID;
        this.statusID = statusID;
        this.date = date;
        this.serviceID = serviceID;
        this.totalFee = totalFee;
    }

    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getSrcPostOfficeID() {
        return srcPostOfficeID;
    }

    public void setSrcPostOfficeID(String srcPostOfficeID) {
        this.srcPostOfficeID = srcPostOfficeID;
    }

    public String getDesPostOfficeID() {
        return desPostOfficeID;
    }

    public void setDesPostOfficeID(String desPostOfficeID) {
        this.desPostOfficeID = desPostOfficeID;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public Float getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Float totalFee) {
        this.totalFee = totalFee;
    }
    
    
}
