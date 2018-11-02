/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;
import com.quangtrong.mp.model.InternationalCity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
/**
 *
 * @author Q
 */
public class InternationalCityMapper implements RowMapper<InternationalCity>{
    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblInternationalCity";
    
    @Override
    public InternationalCity mapRow(ResultSet rs, int i) throws SQLException{
        String cityID = rs.getString("cityID");
        String cityName = rs.getString("cityName");
        return new InternationalCity(cityID, cityName);
    }
}
