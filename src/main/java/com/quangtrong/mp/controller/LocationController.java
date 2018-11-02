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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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
    public void getDistrict(HttpServletRequest request, HttpServletResponse response){
        
        String cityID = request.getParameter("cityID");
        System.out.println(cityID);
        List<District> list = cityDAO.getDistrictByCityID(cityID);
        
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(list);
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        try {
            response.getWriter().println(jsonArray);
        } catch (IOException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
