package com.responceentity.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.responceentity.demo.Model.ModelUser;
import com.responceentity.demo.Services.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




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
    public ResponseEntity<List<ModelUser>> getMethodName() {
        return userServices.getalluser();
    }

    @GetMapping("{id}")
    public ResponseEntity<Object>  getbyId(@PathVariable int id) {
        return userServices.getIduser(id);
    }

    
    

    @PostMapping
    public ResponseEntity<Object>  postMethodName(@RequestBody ModelUser modelUser) {
        
        return userServices.saveuser(modelUser);
    }

    @PutMapping("{id}")
    public ResponseEntity<?>  putMethodName(@PathVariable int id, @RequestBody ModelUser modelUser) {
       
        return  userServices.updateuser(id ,modelUser);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable  int id)
    {
        return userServices.deleteUserById(id); 
    }

}
