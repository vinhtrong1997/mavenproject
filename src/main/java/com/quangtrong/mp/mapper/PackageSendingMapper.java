/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.PackageSending;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class PackageSendingMapper implements RowMapper<PackageSending>{

    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblPackageSending";
    
    @Override
    public PackageSending mapRow(ResultSet rs, int i) throws SQLException {
        String packageID = rs.getString("packageID");
        float weight = rs.getFloat("weight");
        String senderID = rs.getString("senderID");
        String receiverID = rs.getString("receiverID");
        String srcPostOfficeID = rs.getString("srcPostOfficeID");
        String desPostOfficeID = rs.getString("desPostOfficeID");
        String statusID = rs.getString("statusID");
        String date = rs.getString("date");
        String serviceID = rs.getString("serviceID");
        float tFee = rs.getFloat("totalFee");
        
        return new PackageSending(packageID, weight, senderID, receiverID, srcPostOfficeID, desPostOfficeID, statusID, date, serviceID, tFee);
    }
    
}
