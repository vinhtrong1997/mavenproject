/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Role;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class RoleMapper implements RowMapper<Role>{

    public static final String BASE_SQL = "SELECT * FROM tblRole";
    @Override
    public Role mapRow(ResultSet rs, int i) throws SQLException {
        String rID = rs.getString("roleID");
        int rname = rs.getInt("roleLevel");
        String rDes = rs.getString("roleDescription");
        return new Role(rID, rname, rDes);
    }
    
}
