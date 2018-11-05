package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.PackageStatus;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author NgoQuang
 */
public class PackageStatusMapper implements RowMapper<PackageStatus>  {

    @Override
    public PackageStatus mapRow(ResultSet rs, int i) throws SQLException {
        
        String statusID = rs.getString("statusID");
        String statusName = rs.getString("statusName");
        String statusDescription = rs.getString("statusDescription");
        
        return new PackageStatus(statusID, statusName, statusDescription);
    }
    
}
