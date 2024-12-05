package com.myCompany.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    
    @RequestMapping("/demo")
    public static String  method(){
        // System.out.println("Method IS Calling.......");
        return "<h1>Helo G Kya Hal He </h1>";
    }
        
    
    
}
