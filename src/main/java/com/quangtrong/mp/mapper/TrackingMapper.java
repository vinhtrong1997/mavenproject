package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Tracking;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */
public class TrackingMapper implements RowMapper<Tracking> {

    private SimpleDateFormat DATE_FORMAT_1 = new SimpleDateFormat("dd-MMM-yyyy");
    private SimpleDateFormat DATE_FORMAT_2 = new SimpleDateFormat("HH:mm:ss");
    
    @Override
    public Tracking mapRow(ResultSet rs, int i) throws SQLException {
        String trackingID = rs.getString("trackingID").trim();
        String packageID = rs.getString("packageID").trim();
        Date date = rs.getDate("date");
        String postOfficeID = rs.getString("postOfficeID").trim();
        String statusID = rs.getString("statusID").trim();
        
        String dateFm = DATE_FORMAT_1.format(date);
        String time =  DATE_FORMAT_2.format(date);
        return new Tracking(trackingID, packageID, dateFm, postOfficeID,statusID,time);
    }
    
}
