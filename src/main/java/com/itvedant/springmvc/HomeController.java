package com.itvedant.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        System.out.println("index");
        return "welcome";
    }

    @RequestMapping("/aboutus")
    public String aboutUs(){
        System.out.println("aboutus");
        return "aboutus";
    }

}
