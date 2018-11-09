package com.quangtrong.mp.DAO;

import com.quangtrong.mp.mapper.TrackingMapper;
import com.quangtrong.mp.model.Tracking;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

/**
 *
 * @author NgoQuang
 */
@Repository
public class TrackingDAO extends JdbcDaoSupport{
    @Autowired
    public TrackingDAO(DataSource datasuorse){
        this.setDataSource(datasuorse);
    }
    
    public List<Tracking> getTracking(String packageID){
        String sql = "SELECT * FROM tblTracking WHERE packageID=? ORDER BY date DESC";
        Object[] params = new Object[]{packageID};
        TrackingMapper mapper = new TrackingMapper();
        return this.getJdbcTemplate().query(sql, mapper, params);
    }
    
    public int getLastID(){
        String sql = "SELECT MAX(trackingID) AS 'trackingID' FROM tblTracking";
        SqlRowSet queryForRowSet = this.getJdbcTemplate().queryForRowSet(sql);
        while(queryForRowSet.next()){
            return queryForRowSet.getInt("trackingID");
        }
        return 100000;
    }
    
    
    public void insert(Tracking tracking){
        String sql = "INSERT INTO tblTracking VALUES(?,?,?,?,?)";
        Object[] params = new Object[]{tracking.getTrackingID(), tracking.getPackageID(), tracking.getDate(), tracking.getPostOfficeID(),tracking.getStatusID()};
        this.getJdbcTemplate().update(sql, params);
    }
    
    
}
