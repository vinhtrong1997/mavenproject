package com.quangtrong.mp.DAO;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NgoQuang
 */
@Repository
public class CityDAO extends JdbcDaoSupport{
    
    @Autowired
    public CityDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    
}
