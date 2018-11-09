package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.*;
import com.quangtrong.mp.model.ServiceFee;
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
    
    public List<ServiceFee> getServicesFee(){
        String sql = "SELECT * FROM tblServices INNER JOIN tblScope"
                + " ON tblServices.scopeID = tblScope.scopeID"
                + " INNER JOIN tblShippingMethod"
                + " ON tblShippingMethod.shippingMethodID = tblScope.shippingMethodID";
        ServiceFeeMapper mapper = new ServiceFeeMapper();
        
        List<ServiceFee> list = this.getJdbcTemplate().query(sql, mapper);
        return list;
    }
    
}