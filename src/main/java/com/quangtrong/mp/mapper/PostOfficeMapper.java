package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.PostOffice;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */

public class PostOfficeMapper implements RowMapper<PostOffice>{

     public static final String BASE_SQL = "SELECT * FROM tblPostOffice";
    
    @Override
    public PostOffice mapRow(ResultSet rs, int i) throws SQLException {
        String postOfficeID = rs.getString("postOfficeID");
        String locationID = rs.getString("locationID");
        String staffID = rs.getString("staffID");
        String postOfficeName = rs.getString("postOfficeName");
        String serviceID = rs.getString("serviceID");
        String address = rs.getString("address");
        return new PostOffice(postOfficeID, locationID, staffID, postOfficeName, serviceID,address);
    }
    
}
