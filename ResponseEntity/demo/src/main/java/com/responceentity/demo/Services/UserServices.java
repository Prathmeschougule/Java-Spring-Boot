package com.responceentity.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.responceentity.demo.Model.ModelUser;

public interface UserServices {
    
    List<ModelUser>getalluser();
    ModelUser saveuser(ModelUser modelUser);
    ModelUser getIduser(int id);
    ResponseEntity<Object>  updateuser(int id ,ModelUser modelUser);
   ResponseEntity<Object> deleteUserById(int id );

}
