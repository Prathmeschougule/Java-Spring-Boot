package com.responceentity.demo.Services;

import java.util.List;

import com.responceentity.demo.Model.ModelUser;

public interface UserServices {
    
    List<ModelUser>getalluser();
    ModelUser saveuser(ModelUser modelUser);

}
