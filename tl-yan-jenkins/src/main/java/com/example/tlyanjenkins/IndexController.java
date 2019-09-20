package com.example.tlyanjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/home")
    public String index()  {
        return "up Jenkins";
    }


}
