package com.example1.dependecyInjection.controller;

import com.example1.dependecyInjection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController constructor");
        this.myService=myService;
    }

    @GetMapping(value = "/getName")
    public String getMyService() {
        System.out.println("my service");
        return myService.getName();
    }

    @GetMapping(value = "/")
    public String defaultMessage() {
        System.out.println("default message");
        return "Welcome " + getMyService() + " in this web site";
    }

}
