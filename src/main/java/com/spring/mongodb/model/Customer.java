package com.spring.mongodb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customer")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Customer {

    @Id
    long id;
    String firstName;
    String lastName;
    String email;

    CustomerProfile customerProfile;  //one-to-one

    List<Account> account;  //one-to-many
}
