
package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.PackageSendingDAO;
import com.quangtrong.mp.DAO.PackageStatusDAO;
import com.quangtrong.mp.DAO.PostOfficeDAO;
import com.quangtrong.mp.DAO.TrackingDAO;
import com.quangtrong.mp.model.PackageSending;
import com.quangtrong.mp.model.PackageStatus;
import com.quangtrong.mp.model.PostOffice;
import com.quangtrong.mp.model.Tracking;
import com.quangtrong.mp.model.TrackingPackageFV;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class TrackingPackageController {
    @Autowired
    private PackageSendingDAO packageSendingDAO;
    
    @Autowired
    private PackageStatusDAO packageStatusDAO;
    
    @Autowired
    private PostOfficeDAO postOfficeDAO;
    
    @Autowired
    private TrackingDAO trackingDAO;
    
    @RequestMapping(value="/trackingPackage",method=RequestMethod.GET)
    public String index(){
        return "trackingPackage";
    }
    
    @RequestMapping(value="/trackingPackageResult",method=RequestMethod.GET)
    public String tracking(HttpServletRequest request,Model model){
        String packageID = null;
        try{
            packageID = request.getParameter("packageID");
            
            if(!packageID.isEmpty()){
            
                PackageSending obj = packageSendingDAO.getPackageByID(packageID);
                PackageStatus statusObj = packageStatusDAO.getByID(obj.getStatusID());
                PostOffice srcPostOffice = postOfficeDAO.getOfficeByID(obj.getSrcPostOfficeID());
                PostOffice desPostOffice = postOfficeDAO.getOfficeByID(obj.getDesPostOfficeID());

                TrackingPackageFV tpfv = new TrackingPackageFV();
                
                if(obj!=null){
                    tpfv.setPackageID(obj.getPackageID());
                    tpfv.setWeight(obj.getWeight());
                    tpfv.setSourceOffice(srcPostOffice.getPostOfficeName());
                    tpfv.setDestinatiOffice(desPostOffice.getPostOfficeName());
                    
                    List<Tracking> trackingResult = trackingDAO.getTracking(packageID);
                    List<Tracking> trackingResultFV = new ArrayList<Tracking>();
                    
                    
                    tpfv.setStatus(statusObj.getStatusDescription());
                    
                    for(Tracking tk : trackingResult){
                        PackageStatus currentStatus = packageStatusDAO.getByID(tk.getStatusID());
                        PostOffice currentPostOffice = postOfficeDAO.getOfficeByID(tk.getPostOfficeID());
                        
                        tk.setPostOfficeAddress(currentPostOffice.getAddress());
                        tk.setStatus(currentStatus.getStatusDescription());
                        
                        trackingResultFV.add(tk);
                    }
                    
                    
                    model.addAttribute("packageSending", tpfv);
                    model.addAttribute("listTrackingResult",trackingResultFV);
                }
                else model.addAttribute("errorMessage","Không tìm thấy bưu kiện nào phù hợp");
                return "trackingPackageResult";
            }
            else return "trackingPackage";
        }
        catch(Exception e){
            return "trackingPackage";
        }
    }
    
    @RequestMapping(value="/qrcodeScanner", method = RequestMethod.POST)
    public String qrcodeScanner(HttpServletRequest request, Model model){
        
        String packageID = request.getParameter("packageID");
        
        PackageSending obj = packageSendingDAO.getPackageByID(packageID);
        model.addAttribute("packageSending", obj);
        return "trackingPackageResult";
    }
}
