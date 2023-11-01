package com.onrender.englishmap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

    public String home (Model model){
        model.addAttribute("title", "Main page");
        return "home";
    }
}
