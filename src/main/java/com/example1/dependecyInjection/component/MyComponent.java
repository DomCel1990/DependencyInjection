package com.example1.dependecyInjection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor");
        this.myComponentName="Celani Domenico";
    }
    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName()");
        return this.myComponentName;
    }
}
