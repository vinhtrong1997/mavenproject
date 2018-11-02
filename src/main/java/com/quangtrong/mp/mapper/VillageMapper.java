/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quangtrong.mp.mapper;

import com.quangtrong.mp.model.Village;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Q
 */
public class VillageMapper implements RowMapper<Village> {

    public static final String BASE_SQL = "SELECT * FROM tblVillage";

    @Override
    public Village mapRow(ResultSet rs, int i) throws SQLException {
        String vID = rs.getString("villageID");
        String vName = rs.getString("villageName");
        String disricID = rs.getString("districtID");
        return new Village(disricID, vName, disricID);
    }

}
