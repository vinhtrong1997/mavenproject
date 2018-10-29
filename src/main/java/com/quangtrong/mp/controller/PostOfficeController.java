package com.quangtrong.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author NgoQuang
 */
@Controller
public class PostOfficeController {
    
    @RequestMapping(value="/searchPostOffice", method = RequestMethod.GET)
    public String searchPostOffice(){
        return "searchPostOffice";
    }
    
}
