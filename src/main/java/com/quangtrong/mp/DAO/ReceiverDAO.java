/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.ReceiverMapper;
import com.quangtrong.mp.model.Receiver;
import java.sql.Types;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class ReceiverDAO extends JdbcDaoSupport{
    @Autowired
    public ReceiverDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public Receiver getByID(String receiverID){
        String sql = ReceiverMapper.BASE_SQL + " WHERE recieverID=?";
        ReceiverMapper mapper = new ReceiverMapper();
        return this.getJdbcTemplate().queryForObject(sql, mapper, receiverID);
    }
    
    public int getLastID(){
        String sql = "SELECT MAX(recieverID) AS 'recieverID' FROM tblReciever";
        SqlRowSet queryForRowSet = this.getJdbcTemplate().queryForRowSet(sql);
        if(queryForRowSet.next()){
            return queryForRowSet.getInt("recieverID");
        }
        return -1;
    }
    
    public void insert(Receiver receiver){
        String sql = "INSERT INTO tblReciever VALUES(?,?,?,?,?)";
        Object[] params = new Object[]{receiver.getReceiverID(), receiver.getFullname(), receiver.getMobilePhone(), receiver.getCMNDNo(), receiver.getAddress()};
        this.getJdbcTemplate().update(sql, params);
    }
}
