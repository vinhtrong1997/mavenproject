/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.*;
import com.quangtrong.mp.model.Services;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceDAO extends JdbcDaoSupport{
    @Autowired
    public ServiceDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    // get all services from database
    public List<Services> getServices(){
        String sql = ServiceMapper.BASE_SQL;
        ServiceMapper mapper = new ServiceMapper();
        
        List<Services> list = this.getJdbcTemplate().query(sql, mapper);
        return list;
    }
    
}