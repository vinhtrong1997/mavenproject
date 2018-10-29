package com.quangtrong.mp.controller;

import com.quangtrong.mp.DAO.UserDAO;
import com.quangtrong.mp.model.User;
import javax.servlet.ServletRequest;
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
public class LoginController {
    
    @Autowired
    private UserDAO userDAO;
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(Model model){
        return "login";
    }
    
    @RequestMapping(value="/login/userLogin.do", method = RequestMethod.POST)
    public String userLoginAction(Model model, ServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = userDAO.getAnUser(username, password);
        
        if(user != null){
            return "staff";
        }
        return "redirect:/";
    }
    
}
