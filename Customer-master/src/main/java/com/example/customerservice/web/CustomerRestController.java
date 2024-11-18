package com.example.customerservice.web;

import com.example.customerservice.Dao.entities.Customer;
import com.example.customerservice.Dao.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CustomerRestController {
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/customerList")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
    @GetMapping("/customer")
    public Customer customerById(Long id){
        return  customerRepository.findById(id).get();
    }
    @PostMapping("/customerSave")
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);

    }
}
