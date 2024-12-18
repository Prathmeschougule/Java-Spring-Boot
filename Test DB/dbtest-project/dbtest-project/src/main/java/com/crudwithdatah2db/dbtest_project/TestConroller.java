package com.crudwithdatah2db.dbtest_project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestConroller {
    
    @Autowired
    MyRepository myRepository;

    TestConroller(MyRepository myRepository){
        this.myRepository=myRepository;
    }

    @RequestMapping("path1")
    public String crete() {

        myRepository.CreateTable();
        return"Create Repository ";
    }

    @RequestMapping("path2")
    public String insertgy() {

        myRepository.insertdata();

        return"Insert data Succefully ";
    }


    @RequestMapping("path3/{id}")
    public String deleteys(@PathVariable int id ) {

        myRepository.delete( id);
        return"delete Succefully ";
    }
    
}
