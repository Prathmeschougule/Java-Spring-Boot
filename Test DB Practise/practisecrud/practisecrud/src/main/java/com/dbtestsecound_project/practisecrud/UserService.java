package com.dbtestsecound_project.practisecrud;

import java.util.List;


public interface UserService {

  List<User> getuser();
  String saveuser(User user);
  String deleteuser(int id );
  User updatuser(int id,User userUpdate );
  User getUserById(int id);
}
