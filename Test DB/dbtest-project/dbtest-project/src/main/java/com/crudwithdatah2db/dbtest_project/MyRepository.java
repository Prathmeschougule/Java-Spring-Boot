package com.crudwithdatah2db.dbtest_project;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

     // it is handle to the database query
     //dependacy  injection 
     JdbcTemplate jdbcTemplate;


    // dependacy injection Constructore me iject nahi karate to kabhi kabhi null  exeption aa jata he 
     MyRepository(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate=jdbcTemplate;
     }

     public void CreateTable(){
        jdbcTemplate.execute("CREATE TABLE Employee_db (\r\n" + //
                        "    EmployeeID INT PRIMARY KEY,\r\n" + //
                        "    FirstName VARCHAR(50) NOT NULL,\r\n" + //
                        "    LastName VARCHAR(50),\r\n" + //
                        "    Email VARCHAR(100) UNIQUE,\r\n" + //
                        "    HireDate DATE NOT NULL,\r\n" + //
                        "    Salary DECIMAL(10, 2)\r\n" + //
                        ");");
     }


     public void insertdata(){
        jdbcTemplate.update("INSERT INTO Employee_db (EmployeeID, FirstName, LastName, Email, HireDate, Salary)\r\n" + //
                        "VALUES \r\n" + //
                        "(1, 'John', 'Doe', 'john.doe@example.com', '2024-12-01', 55000.00),\r\n" + //
                        "(2, 'Jane', 'Smith', 'jane.smith@example.com', '2024-11-15', 60000.00),\r\n" + //
                        "(3, 'Michael', 'Brown', 'michael.brown@example.com', '2024-10-10', 45000.00),\r\n" + //
                        "(4, 'Emily', 'Davis', 'emily.davis@example.com', '2024-09-20', 70000.00),\r\n" + //
                        "(5, 'Chris', 'Wilson', 'chris.wilson@example.com', '2024-08-05', 48000.00);\r\n" + //
                        "");
     }

     public void delete(int id) {
        String sql = "DELETE FROM Employee_db WHERE EmployeeID = ?";
        jdbcTemplate.update(sql, id);
    }


}
