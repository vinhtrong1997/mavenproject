/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Sender;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class SenderMapper implements RowMapper<Sender>{

    public static final String BASE_SQL = "SELECT * FROM tblSender";
    @Override
    public Sender mapRow(ResultSet rs, int i) throws SQLException {
        String sID = rs.getString("senderID");
        String fname = rs.getString("fullname");
        String mPhone = rs.getString("mobilePhone");
        String address = rs.getString("address");
        String CMND = rs.getString("CMNDNo");
        return new Sender(sID, fname, mPhone, address, CMND);
    }
    
}
