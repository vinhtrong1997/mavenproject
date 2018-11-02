package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author TrongNQ
 */
public class UserMapper implements RowMapper<User>{

    // base sql
    public static final String BASE_SQL = "SELECT * FROM tblUser";
    
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        String userID = rs.getString("userID");
        String username = rs.getString("username");
        String password = rs.getString("password");
        String roleID = rs.getString("roleID");
        String fullname = rs.getString("fullname");
        String email = rs.getString("email");
        return new User(userID, username, password, roleID, fullname, email);
    }
    
}
