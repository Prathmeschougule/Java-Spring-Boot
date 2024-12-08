package com.submissionFormAndLandingPage.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Process {
    
    @PostMapping("/calculate")
    public String calculate(
        @RequestParam double num1,
        @RequestParam double num2,
        @RequestParam String operation
    ) {
        double result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    return "Division by zero is not allowed!";
                }
                break;
            default:
                return "Invalid operation!";
        }
        return "Result: " + result;
    }

   @GetMapping("/result")
    public static String result(@RequestParam int roll){
        if (roll==121) return "Pass";
        return "fail";
    } 

    @PostMapping("personInfo")
    public static String personInfo(@RequestParam String lname,String fname,int num){

        return "<h1>Person Inforation </h1> name :"+fname+lname+"Phone Number : "+num;
    }
}
