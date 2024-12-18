package com.dbtestsecound_project.practisecrud;

import java.util.List;


public interface UserService {

  List<User> getuser();
  String saveuser(User user);
  String deleteuser(int id );
  User updatuser(int id , User user);
  User getUserById(int id);
}
