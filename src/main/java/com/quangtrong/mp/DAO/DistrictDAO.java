/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.DistrictMapper;
import com.quangtrong.mp.model.District;
import javax.sql.DataSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class DistrictDAO extends JdbcDaoSupport{
    
    public DistrictDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public District getByID(String districtID){
        String sql = "SELECT * FROM tblDistrict WHERE districtID=?";
        DistrictMapper mapper = new DistrictMapper();
        return this.getJdbcTemplate().queryForObject(sql, mapper, districtID);
    }
}
