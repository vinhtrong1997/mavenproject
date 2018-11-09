package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.ServiceFee;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */
public class ServiceFeeMapper implements RowMapper<ServiceFee>{

    @Override
    public ServiceFee mapRow(ResultSet rs, int i) throws SQLException {
        String serviceID = rs.getString("serviceID").trim();
        String serviceName = rs.getString("serviceName");
        float serviceFee = rs.getFloat("serviceFee");
        String scopeID = rs.getString("scopeID");
        String scopeDescription = rs.getString("scopeDescription");
        String shippingMethodID = rs.getString("shippingMethodID");
        float scopeFee = rs.getFloat("scopeFee");
        String shippingMethodDes = rs.getString("description");
        float shippingFee = rs.getFloat("shippingFee");
        
        return new ServiceFee(serviceID, serviceName, serviceFee, scopeID, scopeDescription, shippingMethodID, scopeFee, shippingMethodDes, shippingFee);
        
    }
    
}
