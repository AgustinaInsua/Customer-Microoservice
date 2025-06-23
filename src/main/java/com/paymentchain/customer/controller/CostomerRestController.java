package com.paymentchain.customer.controller;

import com.paymentchain.customer.entities.Customer;
import com.paymentchain.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Currency;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CostomerRestController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity<?> post(@RequestBody Customer input){
        Customer save = customerRepository.save(input);
        return ResponseEntity.ok(save);
    }

}
