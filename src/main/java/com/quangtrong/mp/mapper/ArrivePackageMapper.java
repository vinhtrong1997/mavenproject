/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.ArrivePackage;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class ArrivePackageMapper implements RowMapper<ArrivePackage>{
    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblArrivePackage";
    
    @Override
    public ArrivePackage mapRow(ResultSet rs, int rowNum) throws SQLException {
        String arrPackageID = rs.getString("arrivePackageID");
        String packageID = rs.getString("packageID");
        String date = rs.getString("date");
        String staffID = rs.getString("staffID");
        String srcPostOfficeID = rs.getString("srcPostOfficeID");
        return new ArrivePackage(arrPackageID, packageID, date, staffID, srcPostOfficeID);
}
}