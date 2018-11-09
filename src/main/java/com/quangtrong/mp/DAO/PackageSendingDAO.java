package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.PackageSendingMapper;
import com.quangtrong.mp.model.PackageSending;
import java.sql.Types;
import java.util.Calendar;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class PackageSendingDAO extends JdbcDaoSupport{
    
    @Autowired
    public PackageSendingDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public List<PackageSending> getAll(){
        String sql = PackageSendingMapper.BASE_SQL;
        PackageSendingMapper mapper = new PackageSendingMapper();
        List<PackageSending> list = this.getJdbcTemplate().query(sql, mapper);
        return list;
    }
    
    
    public PackageSending getPackageByID(String packageID){
        String sql = PackageSendingMapper.BASE_SQL + " WHERE packageID=?";
        PackageSendingMapper mapper = new PackageSendingMapper();
        Object[] params = new Object[]{packageID};
        
        PackageSending obj = this.getJdbcTemplate().queryForObject(sql, mapper,params);
        return obj;
    }
    
    public int getLastPackageID(){
        String sql = "SELECT MAX(packageID) AS 'packageID' FROM tblPackageSending";
        SqlRowSet slqresult = this.getJdbcTemplate().queryForRowSet(sql);
        while(slqresult.next()){
            return slqresult.getInt("packageID");
        }
        return -1;
    }
    
    
    public void insert(PackageSending packageSending){
        String sql = "INSERT INTO tblPackageSending VALUES(?,?,?,?,?,?,?,?,?,?)";
        int[] types = new int[]{Types.NCHAR, Types.FLOAT, Types.NCHAR,Types.NCHAR,Types.NCHAR,Types.NCHAR,Types.NCHAR,Types.TIMESTAMP,Types.NCHAR,Types.FLOAT};
        Object[] params = new Object[]{packageSending.getPackageID(),packageSending.getWeight(),packageSending.getSenderID(),packageSending.getReceiverID(),packageSending.getSrcPostOfficeID(),packageSending.getDesPostOfficeID(),packageSending.getStatusID(),packageSending.getDate(),packageSending.getServiceID(),packageSending.getTotalFee()};
        
        this.getJdbcTemplate().update(sql, params);
    
    }
}
