package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class ArrivePackage {
    
    private String arrivePackageID;
    private String packageID;
    private String date;
    private String staffID;
    private String srcPostOfficeID;

    public ArrivePackage() {
    }

    public ArrivePackage(String arrivePackageID, String packageID, String date, String staffID, String srcPostOfficeID) {
        this.arrivePackageID = arrivePackageID;
        this.packageID = packageID;
        this.date = date;
        this.staffID = staffID;
        this.srcPostOfficeID = srcPostOfficeID;
    }

    public String getArrivePackageID() {
        return arrivePackageID;
    }

    public void setArrivePackageID(String arrivePackageID) {
        this.arrivePackageID = arrivePackageID;
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

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getSrcPostOfficeID() {
        return srcPostOfficeID;
    }

    public void setSrcPostOfficeID(String srcPostOfficeID) {
        this.srcPostOfficeID = srcPostOfficeID;
    }
    
    
}
