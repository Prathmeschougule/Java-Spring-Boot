package com.dbtestsecound_project.practisecrud;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("user")
public class UserController{

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
    public User  putMethodName(@PathVariable int  id ,User userUpdate) {
      
        
        return service.updatuser(id,userUpdate);
    }
}
