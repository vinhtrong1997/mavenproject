/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.DAO;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


@Repository
public class ArrivePakageDAO extends JdbcDaoSupport{
    
    @Autowired
    public ArrivePakageDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
}
