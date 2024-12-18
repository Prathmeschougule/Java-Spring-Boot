package com.crudwithdatah2db.dbtest_project;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository
// public interface NewRepository extends CrudRepository<User,Long> {

    

// }

@Repository
public interface NewRepository extends JpaRepository<User,Integer> {

    

}
