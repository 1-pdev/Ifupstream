package com.TZ.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String Hello(){
        return "Hello salon from Home controller";
    }
}
