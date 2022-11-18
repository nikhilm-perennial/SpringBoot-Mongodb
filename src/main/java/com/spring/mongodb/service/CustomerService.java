package com.spring.mongodb.service;

import com.spring.mongodb.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Optional<Customer> findCustomerById(long id);

    List<Customer> findCustomer();

    Customer getCustomerByPhone(String phone);

    List<Customer> getCustomerByCity(String city);

    List<Customer> getCustomerByStatusAndType(String type, String status);

    List<Customer> getCustomerByAccountType(String accountType);

    List<Customer> getCustomerByBalanceGreater(double bal);

    void deleteCustomer(long id);
}