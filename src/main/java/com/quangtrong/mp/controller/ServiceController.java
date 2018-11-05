package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.CityDAO;
import com.quangtrong.mp.DAO.ServiceDAO;
import com.quangtrong.mp.model.NationalCity;
import com.quangtrong.mp.model.Services;
import java.util.List;
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
    public String searchServiceFree(){
        return "searchServiceFee";
    }
}
