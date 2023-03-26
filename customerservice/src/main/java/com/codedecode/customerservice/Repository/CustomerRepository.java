package com.codedecode.customerservice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codedecode.customerservice.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{


	List<Customer> findByVaccinationCenterId(Integer id);
}
