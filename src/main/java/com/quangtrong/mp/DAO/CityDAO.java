package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.CityMapper;
import com.quangtrong.mp.mapper.DistrictMapper;
import com.quangtrong.mp.model.District;
import com.quangtrong.mp.model.NationalCity;
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
public class CityDAO extends JdbcDaoSupport{
    
    @Autowired
    public CityDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }
    
    public List<NationalCity> getAllCity(){
        String sql = CityMapper.BASE_SQL;
        CityMapper mapper = new CityMapper();
        
        List<NationalCity> list = this.getJdbcTemplate().query(sql, mapper);
        return list;
    }
    
    public List<District> getDistrictByCityID(String cityID){
        String sql = "SELECT * FROM tblDistrict district"
                + " INNER JOIN tblNationalCity city"
                + " ON district.cityID = city.cityID"
                + " WHERE district.cityID= ?";
        DistrictMapper mapper = new DistrictMapper();
        Object[] params = new Object[]{cityID.trim()};
        List<District> list = this.getJdbcTemplate().query(sql, mapper,params);
        return list;
    }
}
