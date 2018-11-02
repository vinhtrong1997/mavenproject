
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Receiver;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class ReceiverMapper implements RowMapper<Receiver>{

    
    public static final String BASE_SQL = "SELECT * FROM tblReceiver";
    @Override
    public Receiver mapRow(ResultSet rs, int i) throws SQLException {
        String rID = rs.getString("receiverID");
        String fname = rs.getString("fullname");
        String mPhone = rs.getString("mobilePhone");
        String locationID = rs.getString("locationID");
        String CMNd = rs.getString("CMNDNo");
        return new Receiver(rID, fname, mPhone, locationID, CMNd);
    }
    
}
