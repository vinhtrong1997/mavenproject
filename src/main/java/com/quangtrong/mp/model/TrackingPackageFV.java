package com.quangtrong.mp.model;

/**
 *
 * @author NgoQuang
 */
public class TrackingPackageFV {
    
    private String packageID;
    
    private float weight;
    
    private String status;
    
    private String sourceOffice;
    
    private String destinatiOffice;

    public TrackingPackageFV() {
    }


    public String getPackageID() {
        return packageID;
    }

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSourceOffice() {
        return sourceOffice;
    }

    public void setSourceOffice(String sourceOffice) {
        this.sourceOffice = sourceOffice;
    }

    public String getDestinatiOffice() {
        return destinatiOffice;
    }

    public void setDestinatiOffice(String destinatiOffice) {
        this.destinatiOffice = destinatiOffice;
    }
    
    
    
    
}
