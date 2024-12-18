package com.dbtestsecound_project.practisecrud;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServicesImp implements UserService {

    // depency Injection 
    private UserRepository userRepository;
    
   public UserServicesImp(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<User> getuser() {
        // TODO Auto-generated method stub
       return userRepository.findAll();
    }



    @Override
    public String saveuser(User user) {
       userRepository.save(user);
        return "user save Succfully";
    }

    @Override
        public String deleteuser(int id) {
    if (userRepository.existsById(id)) {
        userRepository.deleteById(id);
        return "User deleted successfully.";
    } else {
        return "User not found.";
    }
}

    @Override
    public User updatuser(int id, User user) {
      
        User existinguser=userRepository.findById(id).get();
        
        // existinguser.setId(user.getId());
        existinguser.setName(user.getName());
         userRepository.save(existinguser);
        return existinguser;
    }

    @Override
    public User getUserById(int id) {
        User user=userRepository.findById(id).get();
       
            return user; 
     
        
      
    }
}
