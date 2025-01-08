package com.exeptionhandling.demo.exeption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExeptionHandler {
    
    @ExceptionHandler(ArithmeticException.class)
     public ResponseEntity<?> handleArthmaticError(ArithmeticException e){

    return ResponseEntity.status(500).body("This Is cant Devide by the Zero"); //This is the Coustom
   }

   
// when we dont no Which Type of Exception Come That time Use name only Exeption 

   @ExceptionHandler(Exception.class)
   public ResponseEntity<?> handleArthmaticError(Exception e){
     return ResponseEntity.status(500).body(e.getMessage());  //this line gives the Error 
    //  return ResponseEntity.status(500).body(e);  //this line gives full object Error
 }

 @ExceptionHandler(MyCustomeException.class)
   public ResponseEntity<?> MyCustomeException(MyCustomeException ess){
     return ResponseEntity.status(500).body(ess.getMessage());  //this line gives the Error 
    //  return ResponseEntity.status(500).body(e);  //this line gives full object Error
 }
    
}
