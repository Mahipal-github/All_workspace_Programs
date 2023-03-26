package com.codedecode.customerservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.customerservice.Entity.Customer;
import com.codedecode.customerservice.Repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository repo;
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer c = repo.save(customer);
		return new ResponseEntity<>(c,HttpStatus.CREATED);
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Customer>> displayVaccineWithCustomer(@PathVariable("id") Integer id){
		List<Customer> cfind = repo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(cfind,HttpStatus.FOUND);
}
}