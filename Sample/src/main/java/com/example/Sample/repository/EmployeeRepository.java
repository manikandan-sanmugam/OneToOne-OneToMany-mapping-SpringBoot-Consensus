package com.example.Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Sample.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee , Long>{

}
