package com.practice2.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

        @GetMapping
    public String index(){
            return "index";
        }
}
