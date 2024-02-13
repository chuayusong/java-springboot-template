package com.springbootproject.template.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/pingMe")
    public String pingMe(){
        return "hello world!";
    }
}
