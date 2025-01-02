package com.responceentity.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.responceentity.demo.Dto.DtoUser;
@Repository
public interface UserRepository  extends JpaRepository<DtoUser,Integer>{
    
}
