/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.District;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */
public class DistrictMapper implements RowMapper<District>{

    @Override
    public District mapRow(ResultSet rs, int i) throws SQLException {
        String districtID = rs.getString("districtID");
        String districtName = rs.getString("districtName");
        String cityID = rs.getString("cityID");
        
        District district = new District(districtID, districtName, cityID);
        return district;
    }
    
}
