package com.crudwithdatah2db.dbtest_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("user")
public class UserController {
 
@Autowired
// dependancy Injection By 
 NewRepository newRepository;

//dependacy  injecation in contructore 

 public UserController(NewRepository newRepository){
    this.newRepository=newRepository;
 }


  @GetMapping
  List<User> getAlluser(){
    
    return newRepository.findAll();
     
  }

  @PostMapping
  public String saveUser(@RequestBody User user) {
      newRepository.save(user);
      return "user Save Succesfully";
  }

  @DeleteMapping("{id}")
  public String deletemethod(@PathVariable   int id ){
  User existingUser=newRepository.findById(id).get();
  newRepository.delete(existingUser);
  return "Delete Succefully ";
 } 

  @PutMapping("{id}")
  public User putMethodName(@PathVariable int id , @RequestBody  User user) {
      User updateuser=newRepository.findById(id).get();
    
      // updateuser.setId(user.getId());
      updateuser.setName(user.getName());

      newRepository.save(updateuser);
      return updateuser;
  }
    
}
