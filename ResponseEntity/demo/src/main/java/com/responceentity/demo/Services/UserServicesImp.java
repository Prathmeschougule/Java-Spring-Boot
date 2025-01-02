package com.responceentity.demo.Services;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.responceentity.demo.Dto.DtoUser;
import com.responceentity.demo.Model.ModelUser;
import com.responceentity.demo.Repository.UserRepository;

@Service
public class UserServicesImp implements UserServices {

    // dependacy Injeaction
    @Autowired
    UserRepository userRepository;

    // dependacy injeaction in  Constructor
    public UserServicesImp(UserRepository userRepository ){
        this.userRepository=userRepository;
    }


    @Override
    public ModelUser saveuser(ModelUser modelUser) {
        
        DtoUser dtoUser=new DtoUser();
        BeanUtils.copyProperties(modelUser, dtoUser);
        userRepository.save(dtoUser);

        return modelUser;
    }


    @Override
    public List<ModelUser> getalluser() {
       List<ModelUser>modelUsers=new ArrayList<>();
       List<DtoUser>dtoUserDB=userRepository.findAll();
       for (DtoUser dtoUser : dtoUserDB) {
            ModelUser modelUser=new ModelUser();
            BeanUtils.copyProperties(dtoUser, modelUser);

            modelUsers.add(modelUser);
       }



        return modelUsers;
    }
    
   
}
