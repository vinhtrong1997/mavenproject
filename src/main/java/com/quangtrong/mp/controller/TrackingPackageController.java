
package com.quangtrong.mp.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.quangtrong.mp.DAO.PackageSendingDAO;
import com.quangtrong.mp.model.PackageSending;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class TrackingPackageController {
    @Autowired
    private PackageSendingDAO packageSendingDAO;
    
    @RequestMapping(value="/trackingPackage",method=RequestMethod.GET)
    public String index(){
        return "trackingPackage";
    }
    
    @RequestMapping(value="/trackingPackageResult",method=RequestMethod.GET)
    public String tracking(HttpServletRequest request,Model model){
        String packageID = request.getParameter("packageID");
        if(!packageID.isEmpty()){
            
            PackageSending obj = packageSendingDAO.getPackageByID(packageID);

            if(obj!=null){
                model.addAttribute("packageSending", obj);
            }
            else model.addAttribute("errorMessage","Không tìm thấy bưu kiện nào phù hợp");
            return "trackingPackageResult";
        }
        
        return "trackingPackage";
    }
    
    @RequestMapping(value="/qrcodeScanner", method = RequestMethod.POST)
    public void qrcodeScanner(HttpServletRequest request,HttpServletResponse response){
        
        String packageID = request.getParameter("packageID");
        
        PackageSending obj = packageSendingDAO.getPackageByID(packageID);
        
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(obj);
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
