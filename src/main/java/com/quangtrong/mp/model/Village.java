package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Village {
    
    private String villageID;
    private String villageName;
    private String districtID;

    public Village() {
    }

    public Village(String villageID, String villageName, String districtID) {
        this.villageID = villageID;
        this.villageName = villageName;
        this.districtID = districtID;
    }

    public String getVillageID() {
        return villageID;
    }

    public void setVillageID(String villageID) {
        this.villageID = villageID;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getDistrictID() {
        return districtID;
    }

    public void setDistrictID(String districtID) {
        this.districtID = districtID;
    }
    
    
}
