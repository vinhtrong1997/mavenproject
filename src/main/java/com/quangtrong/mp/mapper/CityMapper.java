package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.NationalCity;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */
public class CityMapper implements RowMapper<NationalCity> {
    
    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblNationalCity";
    
    @Override
    public NationalCity mapRow(ResultSet rs, int i) throws SQLException {
        String cityID = rs.getString("cityID");
        String cityName = rs.getString("cityName");
        return new NationalCity(cityID, cityName);
    }
    
}
