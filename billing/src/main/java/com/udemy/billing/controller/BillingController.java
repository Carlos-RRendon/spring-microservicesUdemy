package com.udemy.billing.controller;

import com.udemy.billing.entity.Invoice;
import com.udemy.billing.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    BillingRepository billingRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Invoice>> getAll(){
        return new ResponseEntity<>(billingRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Invoice> save(Invoice invoice){
        billingRepository.save(invoice);
        return new ResponseEntity<>(invoice,HttpStatus.CREATED);
    }

}
