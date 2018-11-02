/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Scope;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class ScopeMapper implements RowMapper<Scope>{

    public static final String BASE_SQL = "SELECT * FROM tblScope";
    @Override
    public Scope mapRow(ResultSet rs, int i) throws SQLException {
        String sID = rs.getString("scopeID");
        String sDes = rs.getString("scopeDescription");
        String sMethodID = rs.getString("shippingMethodID");
        float sFee = rs.getFloat("scopeFee");
        return new Scope(sID, sDes, sMethodID, sFee);
                
    }
    
}
