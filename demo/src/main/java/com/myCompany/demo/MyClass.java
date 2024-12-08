package com.myCompany.demo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



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

    @GetMapping("check/{num}")
    public static String oddEvne( @PathVariable int num){

        if (num % 2 == 0) {
            return "The Number IS "+num+"Is Even";
          
        }else{
             return "The Number IS "+ num +" The Odd";
        }

       
    }

    @GetMapping("number/{id}")
    public static String chekNumber( @PathVariable int id){
        if (id<100) {
          return "This  Number is the Greater Then 0";
        }else{

            return "This number Is the Less then 0 ";
        }
    }

    @GetMapping("checkNum/{num}")
    public static String checkPRimeNumber(@PathVariable int num){
        if (num <= 1) {
            return "The Number Is Not Prime "+num; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to square root of num
            if (num % i == 0) {
                return "This is Not Prime Number "+num;
            }
        }
            return "This is The Prime Number "+num;
       
    }


     @GetMapping("love/{babu}")
     public static String loveSend(@PathVariable String babu){
        return "Hello Mere Sona "+babu+"❤️❤️❤️";
     }


     @GetMapping("user/{userName}")
     public static String userValidation(@PathVariable String userName){

        // when use String Dont  use == use equals("name") okey
        
        if (userName.equals("para")) {
            return "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/6KQeopPE36I?si=ktLTIP47VYXnsc1u\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"+userName;
        }
        return "This User Not Vaild  "+userName;
     }
    


}
