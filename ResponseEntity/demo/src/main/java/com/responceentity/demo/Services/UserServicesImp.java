package com.responceentity.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.responceentity.demo.Dto.DtoUser;
import com.responceentity.demo.Model.ModelUser;
import com.responceentity.demo.Repository.UserRepository;

@Service
public class UserServicesImp implements UserServices {

    // dependacy Injeaction
    @Autowired
    UserRepository userRepository;

    // dependacy injeaction in Constructor
    public UserServicesImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ModelUser saveuser(ModelUser modelUser) {

        DtoUser dtoUser = new DtoUser();
        BeanUtils.copyProperties(modelUser, dtoUser);
        userRepository.save(dtoUser);

        return modelUser;
    }

    @Override
    public List<ModelUser> getalluser() {
        List<ModelUser> modelUsers = new ArrayList<>();
        List<DtoUser> dtoUserDB = userRepository.findAll();
        for (DtoUser dtoUser : dtoUserDB) {
            ModelUser modelUser = new ModelUser();
            BeanUtils.copyProperties(dtoUser, modelUser);

            modelUsers.add(modelUser);
        }

        return modelUsers;
    }

    @Override
    public ModelUser getIduser(int id) {
        DtoUser dtoUser = userRepository.findById(id).get();
        ModelUser modelUser = new ModelUser();
        BeanUtils.copyProperties(dtoUser, modelUser);
        return modelUser;
    }

    @Override
    public  ResponseEntity<Object> updateuser(int id, ModelUser modelUser) {

        DtoUser dtoUser = userRepository.findById(id).get();

        dtoUser.setName(modelUser.getName());

        userRepository.save(dtoUser);
        
        BeanUtils.copyProperties(dtoUser ,modelUser);

        return ResponseEntity.ok().body("User with ID " + modelUser + " Update successfully.");
    }

    @Override
    public ResponseEntity<Object> deleteUserById(int id) {
        Optional<DtoUser> optionalDtoUser = userRepository.findById(id); // Retrieve Optional

        if (optionalDtoUser.isPresent()) { // Check if user exists
            DtoUser dtoUser = optionalDtoUser.get(); // Get the user object
            userRepository.delete(dtoUser); // Delete the user
            return ResponseEntity.ok().body("User with ID " + id + " deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with ID " + id + " not found.");
        }
    }

   

}
