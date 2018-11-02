package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.PackageSendingMapper;
import com.quangtrong.mp.model.PackageSending;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class PackageSendingDAO extends JdbcDaoSupport{
    
    @Autowired
    public PackageSendingDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public PackageSending getPackageByID(String packageID){
        String sql = PackageSendingMapper.BASE_SQL + " WHERE packageID=?";
        PackageSendingMapper mapper = new PackageSendingMapper();
        Object[] params = new Object[]{packageID};
        
        PackageSending obj = this.getJdbcTemplate().queryForObject(sql, mapper,params);
        return obj;
    }
}
