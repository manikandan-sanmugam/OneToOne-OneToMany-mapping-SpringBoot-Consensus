package com.example.Sample.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Sample.model.Address;
public interface AddressRepository extends JpaRepository <Address , Long> {


}
