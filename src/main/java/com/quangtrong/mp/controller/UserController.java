package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.PostOfficeDAO;
import com.quangtrong.mp.DAO.UserDAO;
import com.quangtrong.mp.model.PostOffice;
import com.quangtrong.mp.model.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author TrongNQ
 */
@Controller
public class UserController {
    
    @Autowired
    private UserDAO userDAO;
    
    @Autowired
    private PostOfficeDAO postOfficeDAO;
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }
    
    @RequestMapping(value="/dashboard", method = RequestMethod.GET)
    public String userLogin(Model model,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("userSession");
        if(user!=null){
            model.addAttribute("pageTitle", "Dashboard");
            return "adminPackage";
        }
        else return "redirect:/";
    }
    
    
    @RequestMapping(value="/dashboard", method = RequestMethod.POST)
    public String userLoginAction(Model model, HttpServletRequest request)
    {
        try{
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            User user = userDAO.getAnUser(username, password);
            PostOffice postOffice = postOfficeDAO.getOfficeByStaff(user.getUserID().trim());
            if(user != null){
                request.getSession().setAttribute("userSession", user);
                request.getSession().setAttribute("postOffice", postOffice);
                model.addAttribute("pageTitle", "Dashboard");
                return "adminPackage";
            }
            else return "redirect:/";
        }
        catch(Exception e){
            return "redirect:/";
        }
    }
    
    @RequestMapping(value = "/manageUsers", method = RequestMethod.GET)
    public String manageUsers(Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("userSession");
        if (user != null) {
            List<User> list = userDAO.listUser();
            request.setAttribute("listUser", list);
            request.setAttribute("totalPage", 15);
            model.addAttribute("pageTitle", "QL Users");
            return "manageUsers";
        } else {
            return "redirect:/";
        }
    }
    
    
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("userSession");
        return "redirect:/";
    }
    
}
