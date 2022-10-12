package com.example1.dependecyInjection.service;

import com.example1.dependecyInjection.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService construct");
        this.myComponent=myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName()");
        return myComponent.getMyComponentName();
    }
}
