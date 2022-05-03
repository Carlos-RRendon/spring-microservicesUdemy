package com.udemy.customer.controller;

import com.udemy.customer.entities.Customer;
import com.udemy.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

}
