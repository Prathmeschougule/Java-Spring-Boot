package com.exeptionhandling.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.exeptionhandling.demo.exeption.MyCustomeException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class Controller {

    @GetMapping("path")
    public String getMethodName() {
        System.out.println(1/2);
        System.out.println(4/0);
        return "This is pass";
    }
    
    @GetMapping("path2")
    public String getMethodName2() {
       String str=null;
       int len=str.length();
       System.out.println(len);
        return "This is pass";
    }

    @GetMapping("path3")
    public String getMethodName3(@RequestParam Integer id) {
       if (id!=2) {
            throw new MyCustomeException("Your Id Dose Not Exist");
       }
      
        return "This is pass";
    }

   
    
}
