package com.in28minutes.springboot.tutorial.basics.application.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String loginMessage() {
        return "welcome";
    }
    
    @RequestMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
    
    
    @RequestMapping("/welcome2")
    public String showWelcome() {
        return "welcome2";
    }
}