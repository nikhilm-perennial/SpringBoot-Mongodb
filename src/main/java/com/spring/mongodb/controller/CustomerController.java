package com.spring.mongodb.controller;

import com.spring.mongodb.model.Customer;
import com.spring.mongodb.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    private CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id){
        return customerService.findCustomerById(id);
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        List<Customer> customers = customerService.findCustomer();
        return customers;
    }

    @PutMapping("/customer/update-account")
    public Customer addAccountDetails(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customer/city/{city}")
    public List<Customer> getCustomerByCity(@PathVariable String city){
        return customerService.getCustomerByCity(city);
    }

    @GetMapping("/customer/phone/{phone}")
    public Customer getCustomerByPhone(@PathVariable String phone){
        Customer customer = customerService.getCustomerByPhone(phone);
        return customer;
    }

    @GetMapping("/customer/account/{accountType}")
    public List<Customer> getCustomerByAccountType(@PathVariable String accountType){
        List<Customer> customers = customerService.getCustomerByAccountType(accountType);
        return customers;
    }

    @GetMapping("/customer/account/type/{type}/status/{status}")
    public List<Customer> getCustomerByAccountStatusAndType(@PathVariable String type,
                                                            @PathVariable String status){
        List<Customer> customers = customerService.getCustomerByStatusAndType(type,status);
        return customers;
    }

    @GetMapping("/customer/account/balance/{bal}")
    public List<Customer> getCustomerByAccountBalGreater(@PathVariable double bal){
        List<Customer> customers = customerService.getCustomerByBalanceGreater(bal);
        return customers;
    }

    @DeleteMapping("/customer/delete/id/{id}")
    public String deleteCustomerById(@PathVariable long id){
        customerService.deleteCustomer(id);
        return "Customer Deleted Successfully....!";
    }
}