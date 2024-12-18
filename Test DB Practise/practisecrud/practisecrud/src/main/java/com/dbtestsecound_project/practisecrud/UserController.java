package com.dbtestsecound_project.practisecrud;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("user")
public class UserController {

//    Dependacy Injection
    UserService service;

//    Dependcy In Constructore
    private UserController(UserService service){
        this.service=service;
    }

    @GetMapping
    public List<User> getAlluser(){
        return service.getuser();
    }
    @GetMapping("{id}")
    public User getById(@PathVariable int id ) {
        return service.getUserById(id);
    }
    

    @PostMapping
    public String createuser(@RequestBody User user){
        return  service.saveuser(user);
    }

    @DeleteMapping("{id}")
    public String deleteMethod(@PathVariable int id){
        return service.deleteuser(id);

    }

    @PutMapping("/{id}")
    public User  putMethodName(@PathVariable int  id, @RequestBody User user ) {
      
        
        return service.updatuser(id, user);
    }
}
