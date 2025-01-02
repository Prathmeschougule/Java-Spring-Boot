package com.responceentity.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.responceentity.demo.Model.ModelUser;
import com.responceentity.demo.Services.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("user")
public class UserController {
    

    // dependacy injeaction
    @Autowired
    UserServices userServices;

    // dependacy injeaction in Constructor
    public UserController(UserServices userServices){
        this.userServices=userServices;
    }

    @GetMapping
    public List<ModelUser> getMethodName() {
        return userServices.getalluser();
    }
    

    @PostMapping
    public ModelUser postMethodName(@RequestBody ModelUser modelUser) {
        
        return userServices.saveuser(modelUser);
    }


    

}
