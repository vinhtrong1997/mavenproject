package com.quangtrong.mp.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.quangtrong.mp.DAO.CityDAO;
import com.quangtrong.mp.DAO.ServiceDAO;
import com.quangtrong.mp.model.NationalCity;
import com.quangtrong.mp.model.ServiceFee;
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
public class ServiceController {
    
    @Autowired
    private ServiceDAO serviceDAO;
    
    @Autowired
    private CityDAO cityDAO;
    
    
    @RequestMapping(value="/getServices",method=RequestMethod.POST)
    public void getServices(){
        List<Services> list = serviceDAO.getServices();
    }
    
    @RequestMapping(value="/searchServiceFee", method=RequestMethod.GET)
    public String searchServiceFee(Model model){
        List<NationalCity> list = cityDAO.getAllCity();
        model.addAttribute("listCity", list);
        return "searchServiceFee";
    }
    
    @RequestMapping(value="/searchServiceFee", method=RequestMethod.POST)
    public String searchServiceFree(HttpServletRequest request, Model model){
        
        float weight = Float.parseFloat(request.getParameter("txtWeight"));
        
        List<ServiceFee> listFee = serviceDAO.getServicesFee();
        
        for(ServiceFee sf: listFee){
            sf.setWeight(weight);
            sf.calTotalFee();
        }
        
        List<NationalCity> list = cityDAO.getAllCity();
        model.addAttribute("listCity", list);
        model.addAttribute("listFee", listFee);
        
        return "searchServiceFee";
    }
    
    @RequestMapping(value="/calServiceFee", method=RequestMethod.POST)
    public void calServiceFee(HttpServletRequest request, HttpServletResponse response){
        String weight = request.getParameter("weight");
        String serviceID = request.getParameter("serviceID");
        
        List<ServiceFee> list = serviceDAO.getServicesFee();
        Gson gson = new Gson();
        JsonElement jsonElement = null;
        for(ServiceFee sv: list){
            if(sv.getServiceID().trim().compareTo(serviceID)==0){
                sv.setWeight(Float.parseFloat(weight));
                sv.calTotalFee();
                jsonElement = gson.toJsonTree(sv);
                break;
            }
        }
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        try {
            response.getWriter().println(jsonElement);
        } catch (IOException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
