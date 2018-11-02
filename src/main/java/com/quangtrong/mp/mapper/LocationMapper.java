/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;
import com.quangtrong.mp.model.Location;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
/**
 *
 * @author Q
 */
public class LocationMapper implements RowMapper<Location>{
    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblLocation";
    
    @Override
    public Location mapRow(ResultSet rs, int i) throws SQLException{
        String locationID = rs.getString("locationID");
        String cityID = rs.getString("cityID");
        return new Location(locationID, cityID);
    }
}
