package com.quangtrong.mp.model;

/**
 *
 * @author NgoQuang
 */
public class PackageStatus {
    
    private String statusID;
    
    private String statusName;
    
    private String statusDescription;

    public PackageStatus() {
    }

    public PackageStatus(String statusID, String statusName, String statusDescription) {
        this.statusID = statusID;
        this.statusName = statusName;
        this.statusDescription = statusDescription;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
    
    
    
}
