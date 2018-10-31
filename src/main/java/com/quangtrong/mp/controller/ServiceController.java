package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.ServiceDAO;
import com.quangtrong.mp.model.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    
    
    @RequestMapping(value="/getServices",method=RequestMethod.POST)
    public void getServices(){
        List<Services> list = serviceDAO.getServices();
    }
    
}
