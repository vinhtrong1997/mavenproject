package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class ShippingMethod {
    
    private String shippingMethodID;
    private String description;
    private Float shippingfee;

    public ShippingMethod() {
    }

    public ShippingMethod(String shippingMethodID, String description, Float shippingfee) {
        this.shippingMethodID = shippingMethodID;
        this.description = description;
        this.shippingfee = shippingfee;
    }

    public String getShippingMethodID() {
        return shippingMethodID;
    }

    public void setShippingMethodID(String shippingMethodID) {
        this.shippingMethodID = shippingMethodID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getShippingfee() {
        return shippingfee;
    }

    public void setShippingfee(Float shippingfee) {
        this.shippingfee = shippingfee;
    }
    
    
}
