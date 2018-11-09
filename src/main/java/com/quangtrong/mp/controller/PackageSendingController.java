package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.PackageSendingDAO;
import com.quangtrong.mp.DAO.PostOfficeDAO;
import com.quangtrong.mp.DAO.ReceiverDAO;
import com.quangtrong.mp.DAO.SenderDAO;
import com.quangtrong.mp.model.PackageSending;
import com.quangtrong.mp.model.PostOffice;
import com.quangtrong.mp.model.Receiver;
import com.quangtrong.mp.model.Sender;
import com.quangtrong.mp.model.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.quangtrong.mp.DAO.CityDAO;
import com.quangtrong.mp.DAO.DistrictDAO;
import com.quangtrong.mp.DAO.ServiceDAO;
import com.quangtrong.mp.DAO.TrackingDAO;
import com.quangtrong.mp.model.District;
import com.quangtrong.mp.model.NationalCity;
import com.quangtrong.mp.model.Services;
import com.quangtrong.mp.model.Tracking;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NgoQuang
 */
@Controller
public class PackageSendingController {
    
    @Autowired
    private PackageSendingDAO packageSendingDAO;
    
    @Autowired
    private SenderDAO senderDAO;
    
    @Autowired
    private ReceiverDAO receiverDAO;
    
    @Autowired
    private PostOfficeDAO postOfficeDAO;
    
    @Autowired
    private CityDAO cityDAO;
    
    @Autowired
    private ServiceDAO serviceDAO;
    
    @Autowired
    private DistrictDAO  districtDAO;
    
    @Autowired
    private TrackingDAO trackingDAO;
    
    
    @RequestMapping(value="/managePackage",method=RequestMethod.GET)
    public String index(Model model, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("userSession");
        if(user!=null){
            List<PackageSending> list = packageSendingDAO.getAll();
            model.addAttribute("listPackage", list);
            model.addAttribute("pageTitle", "QL Bưu phẩm");
            return "managePackage";
        }
        else return "redirect:/";        
    }
    
    @RequestMapping(value="viewDetail", method=RequestMethod.POST)
    public void viewDetail(HttpServletRequest request,HttpServletResponse response){
        String packageID = request.getParameter("packageID");
        PackageSending packageSending = packageSendingDAO.getPackageByID(packageID);
        Sender sd = senderDAO.getByID(packageSending.getSenderID());
        Receiver rc = receiverDAO.getByID(packageSending.getReceiverID());
        PostOffice srcPostOffice = postOfficeDAO.getOfficeByID(packageSending.getSrcPostOfficeID());
        PostOffice desPostOffice = postOfficeDAO.getOfficeByID(packageSending.getDesPostOfficeID());
        
        Gson gson = new Gson();
        JsonElement jsonElement1 = gson.toJsonTree(packageSending);
        JsonElement jsonElement2 = gson.toJsonTree(sd);
        JsonElement jsonElement3 = gson.toJsonTree(rc);
        JsonElement jsonElement4 = gson.toJsonTree(srcPostOffice);
        JsonElement jsonElement5 = gson.toJsonTree(desPostOffice);
        
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonElement1);
        jsonArray.add(jsonElement2);
        jsonArray.add(jsonElement3);
        jsonArray.add(jsonElement4);
        jsonArray.add(jsonElement5);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        try {
            response.getWriter().println(jsonArray);
        } catch (IOException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @RequestMapping(value="/controlPackage",method=RequestMethod.GET)
    public String addPackage(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("userSession");
        if(user!=null){
            String control = request.getParameter("control");
            
            List<NationalCity> list = cityDAO.getAllCity();
            
            int lastPackageID = packageSendingDAO.getLastPackageID();
            
            List<Services> list2 = serviceDAO.getServices();
            
            
            if(control.compareTo("addPackage")==0){
                model.addAttribute("pageTitle", "QL Bưu phẩm");
                model.addAttribute("lastPackageID", lastPackageID+1);
                model.addAttribute("listService", list2);
                model.addAttribute("listCity", list);
                return "addPackage";
            }
            
            if(control.compareTo("departurePackage")==0)
            {
                model.addAttribute("pageTitle", "QL Bưu phẩm");
                return "departurePackage";
            }

            if(control.compareTo("arrivalPackage")==0)
            {
                model.addAttribute("pageTitle", "QL Bưu phẩm");
                return "arrivalPackage";
            }

            return "managePackage";
        }
        else return "redirect:/";
    }
    
    @RequestMapping(value="/controlPackage",method=RequestMethod.POST)
    public String addPackageToDB(HttpServletRequest request, Model model)
    {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PackageSendingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String control = request.getParameter("control");
        if(control.compareTo("addPackage")==0){
            int senderID = senderDAO.getLastID()+1;
            int recieverID = receiverDAO.getLastID()+1;
            String senderName = request.getParameter("senderName");
            String senderCityID = request.getParameter("cityFrom");
            NationalCity senderCity = cityDAO.getByID(senderCityID.trim());
            String senderDistrictID = request.getParameter("districtFrom");
            District senderDistrict = districtDAO.getByID(senderDistrictID.trim());
            String senderAddress = request.getParameter("senderAddress")+","+senderDistrict.getDistrictName()+","+senderCity.getCityName();
            String senderPhone = request.getParameter("senderPhone");
            
            String desPO = request.getParameter("desPostOffice");
            String srcPO = request.getParameter("srcPostOffice");
            
            String recieverName = request.getParameter("senderName");
            String recieverCityID = request.getParameter("cityTo");
            String recieverDistrictID = request.getParameter("districtTo");
            NationalCity recieverCity = cityDAO.getByID(recieverCityID.trim());
            District recieverDistrict = districtDAO.getByID(recieverDistrictID.trim());
            String recieverAddress = request.getParameter("senderAddress")+","+recieverDistrict.getDistrictName()+","+recieverCity.getCityName();
            String recieverPhone = request.getParameter("senderPhone");
            
            String weight = request.getParameter("weight");

            String service = request.getParameter("serviceID");
            
            String packageID = request.getParameter("packageID");
            
            String totalFee = request.getParameter("totalFee");
            
            Sender sender = new Sender(String.valueOf(senderID), senderName, senderPhone, senderAddress, "");
            
            Receiver receiver = new Receiver(String.valueOf(recieverID), recieverName, recieverPhone, recieverAddress, "");
            
            
            senderDAO.insert(sender);
            receiverDAO.insert(receiver);
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            PackageSending packageSending = new PackageSending(packageID, Float.parseFloat(weight), String.valueOf(senderID), String.valueOf(recieverID), srcPO, desPO, "STA1001" , sdf.format(date), service, Float.parseFloat(totalFee));
            
            packageSendingDAO.insert(packageSending);
            
            int trackingID = trackingDAO.getLastID()+1;
            
            Tracking tracking = new Tracking(String.valueOf(trackingID), packageID, packageSending.getDate(), packageSending.getSrcPostOfficeID(), packageSending.getStatusID(),"");
            
            trackingDAO.insert(tracking);
            
            List<PackageSending> list = packageSendingDAO.getAll();
            model.addAttribute("listPackage", list);
            model.addAttribute("pageTitle", "QL Bưu phẩm");
            return "managePackage";
        }
        
        return "redirect:/";
    }
}
