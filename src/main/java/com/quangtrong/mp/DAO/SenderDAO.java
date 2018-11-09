/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.SenderMapper;
import com.quangtrong.mp.model.Sender;
import java.sql.Types;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class SenderDAO extends JdbcDaoSupport{
    @Autowired
    public SenderDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public Sender getByID(String senderID){
        String sql = SenderMapper.BASE_SQL + " WHERE senderID=?";
        SenderMapper mapper = new SenderMapper();
        return this.getJdbcTemplate().queryForObject(sql, mapper, senderID);
    }
    
    public int getLastID(){
        String sql = "SELECT MAX(senderID) AS 'senderID' FROM tblSender";
        SqlRowSet queryForRowSet = this.getJdbcTemplate().queryForRowSet(sql);
        while(queryForRowSet.next()){
            return queryForRowSet.getInt("senderID");
        }
        return -1;
    }
    
    public void insert(Sender sender){
        String sql = "INSERT INTO tblSender VALUES(?,?,?,?,?)";
        Object[] params = new Object[]{sender.getSenderID(), sender.getFullname(), sender.getMobilePhone(), sender.getCMNDNo(), sender.getAddress()};
        int[] types = new int[]{Types.NCHAR, Types.NVARCHAR,Types.NCHAR,Types.NCHAR, Types.NVARCHAR};
        this.getJdbcTemplate().update(sql, params);
    }
    
}
