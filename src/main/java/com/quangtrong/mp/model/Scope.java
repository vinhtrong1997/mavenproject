package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Scope {
    
    private String scopeID;
    private String scopeDescription;
    private String shippingMethodID;
    private Float scopeFee;

    public Scope() {
    }

    public Scope(String scopeID, String scopeDescription, String shippingMethodID, Float scopeFee) {
        this.scopeID = scopeID;
        this.scopeDescription = scopeDescription;
        this.shippingMethodID = shippingMethodID;
        this.scopeFee = scopeFee;
    }

    public String getScopeID() {
        return scopeID;
    }

    public void setScopeID(String scopeID) {
        this.scopeID = scopeID;
    }

    public String getScopeDescription() {
        return scopeDescription;
    }

    public void setScopeDescription(String scopeDescription) {
        this.scopeDescription = scopeDescription;
    }

    public String getShippingMethodID() {
        return shippingMethodID;
    }

    public void setShippingMethodID(String shippingMethodID) {
        this.shippingMethodID = shippingMethodID;
    }

    public Float getScopeFee() {
        return scopeFee;
    }

    public void setScopeFee(Float scopeFee) {
        this.scopeFee = scopeFee;
    }
    
    
}
