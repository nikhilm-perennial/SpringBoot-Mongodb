package com.spring.mongodb.repository;

import com.spring.mongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long> {
    @Query("{'CustomerProfile.phone': ?0}")
    Customer findByPhone(String phone);

    @Query("{'CustomerProfile.city': ?0}")
    List<Customer> findByCity(String city);

    @Query("{'Account.accountType': ?0,'Account.accountStatus': ?1}")
    List<Customer> findByTypeAndStatus(String type, String status);

    @Query("{'Account.accountType': ?0}")
    List<Customer> findByAccountType(String accountType);

    @Query("{'Account.balance': {$gt: ?0}}")
    List<Customer> findByAccountBalanceGreater(double bal);
}
