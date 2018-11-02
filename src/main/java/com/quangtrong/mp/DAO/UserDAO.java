package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.UserMapper;
import com.quangtrong.mp.model.User;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TrongNQ
 */

@Repository
public class UserDAO extends JdbcDaoSupport{
    
    @Autowired
    public UserDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    
    // function to get all user from database
    public List<User> listUser(){
        String sql = UserMapper.BASE_SQL;
        
        UserMapper mapper = new UserMapper();
        List<User> list = this.getJdbcTemplate().query(sql, mapper);
        
        return list;
    }
    
    // function to get an user with username and password
    public User getAnUser(String username, String password){
        String sql = UserMapper.BASE_SQL + " WHERE username=? AND password=?";
        Object[] params = new Object[]{username,password};
        UserMapper mapper = new UserMapper();
        
        User user = this.getJdbcTemplate().queryForObject(sql, mapper, params);
        return user;
    }
}
