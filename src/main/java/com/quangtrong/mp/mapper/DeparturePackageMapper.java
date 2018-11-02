/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;
import com.quangtrong.mp.model.DeparturePackage;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class DeparturePackageMapper implements RowMapper<DeparturePackage>{
    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblDeparturePackage";
    
    @Override
    public DeparturePackage mapRow(ResultSet rs, int i) throws SQLException{
        String dPackageID = rs.getString("depaturePackageID");
        String packageID = rs.getString("packageID");
        String date = rs.getString("date");
        String staffID = rs.getString("staffID");
        String desPostOfficeID = rs.getString("desPostOfficeID");
        return new DeparturePackage(dPackageID, packageID, date, staffID, desPostOfficeID);
                
    }
}
