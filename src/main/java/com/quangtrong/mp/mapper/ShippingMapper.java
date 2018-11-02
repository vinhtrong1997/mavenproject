package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.ShippingMethod;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class ShippingMapper implements RowMapper<ShippingMethod>{

    public static final String BASE_SQL = "SELECT * FROM tblShippingMethod";
    @Override
    public ShippingMethod mapRow(ResultSet rs, int i) throws SQLException {
        String sMID = rs.getString("shippingMethodID");
        String des = rs.getString("description");
        Float shipFee = rs.getFloat("shippingFee");
        return new ShippingMethod(sMID, des, shipFee);
    }
    
}
