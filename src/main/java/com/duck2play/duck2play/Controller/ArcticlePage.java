package com.duck2play.duck2play.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArcticlePage {

    @GetMapping("/articlepage")
    public String getArticlePage(){
        return "articlepage";
    }

}
