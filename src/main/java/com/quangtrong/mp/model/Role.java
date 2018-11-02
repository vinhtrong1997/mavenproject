package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */
public class Role {
    
    private String roleID;
    private int roleLevel;
    private String roleDescription;

    public Role() {
    }

    public Role(String roleID, int roleLevel, String roleDescription) {
        this.roleID = roleID;
        this.roleLevel = roleLevel;
        this.roleDescription = roleDescription;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
    
    
}
