package com.quangtrong.mp.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.quangtrong.mp.DAO.CityDAO;
import com.quangtrong.mp.DAO.PostOfficeDAO;
import com.quangtrong.mp.DAO.ServiceDAO;
import com.quangtrong.mp.model.NationalCity;
import com.quangtrong.mp.model.PostOffice;
import com.quangtrong.mp.model.Services;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author NgoQuang
 */
@Controller
public class PostOfficeController {
    
    @Autowired
    private CityDAO cityDAO;
    
    @Autowired
    private ServiceDAO serviceDAO;
    
    @Autowired
    private PostOfficeDAO postOfficeDAO;
    
    @RequestMapping(value="/searchPostOffice", method = RequestMethod.GET)
    public String searchPostOffice(Model model){
        
        List<NationalCity> list = cityDAO.getAllCity();
        List<Services> listServices = serviceDAO.getServices();
        
        model.addAttribute("listCity", list);
        model.addAttribute("listService",listServices);
        return "searchPostOffice";
    }
    
    @RequestMapping(value="/searchPostOffice", method = RequestMethod.POST)
    public void searchPostOffice(HttpServletRequest request, HttpServletResponse response){
        String cityID = request.getParameter("cityID");
        String districtID = request.getParameter("districtID");
        String serviceID = request.getParameter("serviceID");
        
        List<PostOffice> list = postOfficeDAO.searchPostOffice(serviceID, cityID, districtID);
        
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
