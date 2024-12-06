package com.myCompany.demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MyClass {
    
    @RequestMapping("/demo")
    public static String  method(){
        // System.out.println("Method IS Calling.......");
        return "<h1>Helo G Kya Hal He </h1>";
    }
        

  
    @GetMapping("date")
    public Date myCloack(){
         Date dt=new Date();
         return dt;
    }

    // formeted Date and Time 

    @GetMapping("checkDate")
    public static String fomatClock(){

        LocalDateTime now=LocalDateTime.now();//current Date And Time 
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss") ; //Desired format
        return now.format(formatter);//format and Retrun As String 
    }

    //Check Even Oadd Number

    @GetMapping("check")
    public static String oddEvne(){
        int number=5;

        if (number % 2 == 0) {
            return "The Number IS "+number+"Is Even";
        }else{
             return "The Number IS "+ number +" The Odd";
        }

       
    }
    
}
