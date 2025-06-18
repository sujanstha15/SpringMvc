package com.substring.dynamic.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        //logic can be written here
        System.out.println("Home controller method executed");


        LocalDateTime currentDateTime = LocalDateTime.now();
        String name = "Sujan";
        model.addAttribute("currentDate", currentDateTime);
        model.addAttribute("userName", name);

        return "home"; //this string home is name of our template
    }

    //about page
    @RequestMapping("/about")
    public String about(){
        System.out.println("Executing about logic");
        return "about";
    }
}
