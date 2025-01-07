package com.responceentity.demo.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.responceentity.demo.Model.ModelUser;

public interface UserServices {
    
    ResponseEntity<List<ModelUser>> getalluser();
    ResponseEntity<Object>  saveuser(ModelUser modelUser);
    ResponseEntity<Object>  getIduser(int id);
    ResponseEntity<?>  updateuser(int id ,ModelUser modelUser);
   ResponseEntity<Object> deleteUserById(int id );

}
