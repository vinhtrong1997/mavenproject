package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.PackageSendingDAO;
import com.quangtrong.mp.model.PackageSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author NgoQuang
 */
@Controller
public class trackingPackageDeliveryController {
    
    @Autowired
    private PackageSendingDAO packageSendingDAO;
    
    @RequestMapping(value="/trackingPackage",method=RequestMethod.GET)
    public String index(){
        return "trackingPackage";
    }
    
    @RequestMapping(value="/trackingPackageResult/{packageID}",method=RequestMethod.GET)
    public String tracking(@PathVariable("packageID") String packageID,Model model){
        PackageSending obj = packageSendingDAO.getPackageByID(packageID);
        System.out.println(obj);
        if(obj!=null){
            model.addAttribute("package", obj);
            return "trackingPackageResult";
        }
        return "trackingPackage";
    }
}
