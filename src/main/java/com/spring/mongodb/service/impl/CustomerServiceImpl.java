package com.spring.mongodb.service.impl;

import com.spring.mongodb.model.Customer;
import com.spring.mongodb.repository.CustomerRepository;
import com.spring.mongodb.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findCustomerById(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findCustomer() {
        List<Customer> customer = customerRepository.findAll();
        return customer;
    }

    @Override
    public Customer getCustomerByPhone(String phone) {
        Customer customer = customerRepository.findByPhone(phone);
        return customer;
    }

    @Override
    public List<Customer> getCustomerByCity(String city) {
        List<Customer> customers = customerRepository.findByCity(city);
        return customers;
    }

    @Override
    public List<Customer> getCustomerByStatusAndType(String type, String status) {
        List<Customer> customers = customerRepository.findByTypeAndStatus(type,status);
        return customers;
    }

    @Override
    public List<Customer> getCustomerByAccountType(String accountType) {
        List<Customer> customers = customerRepository.findByAccountType(accountType);
        return customers;
    }

    @Override
    public List<Customer> getCustomerByBalanceGreater(double bal) {
        List<Customer> customers = customerRepository.findByAccountBalanceGreater(bal);
        return customers;
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
