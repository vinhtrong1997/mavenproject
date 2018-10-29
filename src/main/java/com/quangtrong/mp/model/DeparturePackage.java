package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class DeparturePackage {
    
    private String depaturePackageID;
    private String packageID;
    private String date;
    private String staffID;
    private String desPostOfficeID;

    public DeparturePackage() {
    }

    public DeparturePackage(String depaturePackageID, String packageID, String date, String staffID, String desPostOfficeID) {
        this.depaturePackageID = depaturePackageID;
        this.packageID = packageID;
        this.date = date;
        this.staffID = staffID;
        this.desPostOfficeID = desPostOfficeID;
    }

    public String getDepaturePackageID() {
        return depaturePackageID;
    }

    public void setDepaturePackageID(String depaturePackageID) {
        this.depaturePackageID = depaturePackageID;
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

    public String getDesPostOfficeID() {
        return desPostOfficeID;
    }

    public void setDesPostOfficeID(String desPostOfficeID) {
        this.desPostOfficeID = desPostOfficeID;
    }
    
    
}
