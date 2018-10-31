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
public class PostOfficeController {
    
    @Autowired
    private CityDAO cityDAO;
    
    @Autowired
    private ServiceDAO serviceDAO;
    
    @RequestMapping(value="/searchPostOffice", method = RequestMethod.GET)
    public String searchPostOffice(Model model){
        
        List<NationalCity> list = cityDAO.getAllCity();
        List<Services> listServices = serviceDAO.getServices();
        
        model.addAttribute("listCity", list);
        model.addAttribute("listService",listServices);
        return "searchPostOffice";
    }
    
}
