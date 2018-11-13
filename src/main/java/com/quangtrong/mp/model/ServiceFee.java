package com.quangtrong.mp.model;

/**
 *
 * @author NgoQuang
 */

public class ServiceFee {
    
    private String serviceID;
    
    private String serviceName;
    
    private float serviceFee;
    
    private String scopeID;
    
    private String scopeDescription;
    
    private String shippingMethodID;
    
    private float scopeFee;
    
    private String shippingMethodDes;
    
    private float shippingMethodFee;

    private float totalFee;
    
    private float weight;
    
    
    public ServiceFee() {
    }

    public ServiceFee(String serviceID, String serviceName, float serviceFee, String scopeID, String scopeDescription, String shippingMethodID, float scopeFee, String shippingMethodDes, float shippingMethodFee) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
        this.scopeID = scopeID;
        this.scopeDescription = scopeDescription;
        this.shippingMethodID = shippingMethodID;
        this.scopeFee = scopeFee;
        this.shippingMethodDes = shippingMethodDes;
        this.shippingMethodFee = shippingMethodFee;
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

    public float getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
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

    public float getScopeFee() {
        return scopeFee;
    }

    public void setScopeFee(float scopeFee) {
        this.scopeFee = scopeFee;
    }

    public String getShippingMethodDes() {
        return shippingMethodDes;
    }

    public void setShippingMethodDes(String shippingMethodDes) {
        this.shippingMethodDes = shippingMethodDes;
    }

    public float getShippingMethodFee() {
        return shippingMethodFee;
    }

    public void setShippingMethodFee(float shippingMethodFee) {
        this.shippingMethodFee = shippingMethodFee;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public void calTotalFee(){
        totalFee = (serviceFee+scopeFee+shippingMethodFee)*(weight/100);
    }
    
    public float getTotalFee() {
        return totalFee;
    }
    
    
    
}
