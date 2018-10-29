package com.quangtrong.mp.model;

/**
 *
 * @author Q
 */

public class User {
    
    private String UserID;
    private String username;
    private String password;
    private String roleID;
    private String fullname;
    private String email;

    public User() {
    }

    public User(String UserID, String username, String password, String roleID, String fullname, String email) {
        this.UserID = UserID;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
        this.fullname = fullname;
        this.email = email;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRoleID() {
        return roleID;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }
    
}
