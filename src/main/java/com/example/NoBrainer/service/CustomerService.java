package com.example.NoBrainer.service;

import com.example.NoBrainer.model.Customer;
import com.example.NoBrainer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        System.out.println(customer);
    }
}
