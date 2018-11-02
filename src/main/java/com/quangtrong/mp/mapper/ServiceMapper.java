package com.quangtrong.mp.mapper;


import com.quangtrong.mp.model.Services;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class ServiceMapper implements RowMapper<Services>{

    public static final String BASE_SQL = "SELECT * FROM tblServices";
    
    @Override
    public Services mapRow(ResultSet rs, int i) throws SQLException {
        String serviceID = rs.getString("serviceID");
        String serviceName = rs.getString("serviceName");
        Float sfee = rs.getFloat("serviceFee");
        String sID = rs.getString("scopeID");
        return new Services(serviceID, serviceName, sfee, sID);
    }
    
}