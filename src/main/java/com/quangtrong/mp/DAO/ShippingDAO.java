package com.quangtrong.mp.DAO;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ShippingDAO extends JdbcDaoSupport{
    @Autowired
    public ShippingDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
}
