package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SPAController {

@RequestMapping({ "/pages/**" })
   public String index() {
       return "forward:/index.html";
   }
}