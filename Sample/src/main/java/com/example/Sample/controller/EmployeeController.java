package com.example.Sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Sample.model.Employee;
import com.example.Sample.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired EmployeeRepository employeeRepository;

   @PostMapping("/update")
    public ResponseEntity<String> SaveEmployee(@RequestBody Employee empData){
        employeeRepository.save(empData);
        return ResponseEntity.ok("Data saved");
    }
    @GetMapping("/show_all")
    public List<Employee> getData(){
        return (List<Employee>)  employeeRepository.findAll();
    }

}
