package com.example.Sample.model;
//import java.util.*;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long emp_id;

    @Column(name = "emp_name")
    private String emp_name;

    @Column(name = "emp_age")
    private String emp_age;

    // -------------------------------------------------------------//

    public Employee(Long emp_id, String emp_name, String emp_age, List<Address> address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.address = address;
    }

    public Employee() {
    }

    // -------------------------------------------------------------//

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(String emp_age) {
        this.emp_age = emp_age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    // -------------------------------------------------------------//

    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", address=" + address
                + "]";
    }

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name="add_id")
    // private Address address;


    //---------for ontoOne using these  commanted part and ine to one in the address.java and change address to string type-------//

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id",referencedColumnName = "emp_id")
     private  List<Address> address;
}
