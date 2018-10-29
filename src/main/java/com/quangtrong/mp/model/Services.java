package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Services {
    
    private String serviceID;
    private String serviceName;
    private Float serviceFee;
    private String scopeID;

    public Services() {
    }

    public Services(String serviceID, String serviceName, Float serviceFee, String scopeID) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
        this.scopeID = scopeID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Float getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Float serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getScopeID() {
        return scopeID;
    }

    public void setScopeID(String scopeID) {
        this.scopeID = scopeID;
    }
    
    
}
