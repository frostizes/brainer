package com.example.NoBrainer.controller;

import com.example.NoBrainer.model.Customer;
import com.example.NoBrainer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping("/customer")
    public void addNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }
}
