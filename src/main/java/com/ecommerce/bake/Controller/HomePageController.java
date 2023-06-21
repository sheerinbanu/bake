package com.ecommerce.bake.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomePageController {
    @GetMapping("/")
        public String homePage(Model model){
            return "homePage";
        }
}