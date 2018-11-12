package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.PostOfficeMapper;
import com.quangtrong.mp.model.PostOffice;
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
public class PostOfficeDAO extends JdbcDaoSupport{
    
    
    @Autowired
    public PostOfficeDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    public List<PostOffice> listAllPO(){
        String sql = PostOfficeMapper.BASE_SQL;
        PostOfficeMapper mapper = new PostOfficeMapper();
        List<PostOffice> list = this.getJdbcTemplate().query(sql, mapper);
        return list;
    }
    
    public List<PostOffice> searchPostOffice(String serviceID, String cityID, String districtID){
        
        String sql = PostOfficeMapper.BASE_SQL + " WHERE tblPostOffice.locationID IN"
                + " ( SELECT locationID FROM tblLocation WHERE tblLocation.cityID IN "
                + " ( SELECT tblDistrict.cityID from tblDistrict INNER JOIN tblNationalCity ON tblDistrict.cityID = tblNationalCity.cityID"
                + "  WHERE tblDistrict.districtID = ? AND tblDistrict.cityID = ?))";
        
        Object[] params = new Object[]{districtID, cityID};
        PostOfficeMapper mapper = new PostOfficeMapper();
        List<PostOffice> list = this.getJdbcTemplate().query(sql, mapper, params);
        
        return list;
    }
    
    public PostOffice getOfficeByID(String postOfficeID){
        String sql = PostOfficeMapper.BASE_SQL + " WHERE postOfficeID = ?";
        
        PostOfficeMapper mapper = new PostOfficeMapper();
        return this.getJdbcTemplate().queryForObject(sql, mapper, postOfficeID);
    }
    
    public PostOffice getOfficeByStaff(String staffID){
        String sql = PostOfficeMapper.BASE_SQL + " WHERE staffID = ?";
        PostOfficeMapper mapper = new PostOfficeMapper();
        return this.getJdbcTemplate().queryForObject(sql, mapper, staffID);
    }
}
