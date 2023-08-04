package com.example.Sample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long add_id;

    @Column(name = "address_type")
    private String address_type;

    @Column(name = "city")
    private String city;
    // -------------------------------------------------------------//

    public Address() {

    }

    public Address(Long add_id, String city, String address_type) {
        this.add_id = add_id;
        this.city = city;
        this.address_type = address_type;
    }
    // -------------------------------------------------------------//

    public Long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(Long add_id) {
        this.add_id = add_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }

    // -------------------------------------------------------------//

    // @OneToOne(mappedBy = "address")
    // private Employee employee;

}
