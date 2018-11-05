package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.PackageStatusMapper;
import com.quangtrong.mp.model.PackageStatus;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NgoQuang
 */
@Repository
public class PackageStatusDAO extends JdbcDaoSupport{
    
    @Autowired
    public PackageStatusDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    public PackageStatus getByID(String statusID){
        String sql = "SELECT * FROM tblPackageStatus WHERE statusID=?";
        
        PackageStatusMapper mapper = new PackageStatusMapper();
        
        return this.getJdbcTemplate().queryForObject(sql, mapper, statusID);
    }
}
