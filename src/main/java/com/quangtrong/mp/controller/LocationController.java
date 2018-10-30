package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.CityDAO;
import com.quangtrong.mp.model.District;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NgoQuang
 */
@Controller
public class LocationController {
    
    @Autowired
    private CityDAO cityDAO;
    
    @RequestMapping(value="getDistrict",method=RequestMethod.POST)
    public String getDistrict(HttpServletRequest request, HttpServletResponse respone){
        
        String cityID = request.getParameter("cityID");
        List<District> list = cityDAO.getDistrictByCityID(cityID);
        
        Map<String,String> mapDistrict = new HashMap<String, String>();
        
        for(District dis:list){
            mapDistrict.put(dis.getDistricID(), dis.getDistrictName());
        }
        
        String json = new Gson().toJson(mapDistrict);
        try {
            respone.getWriter().write(json);
        } catch (IOException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "searchPostOffice";
    }
    
}
