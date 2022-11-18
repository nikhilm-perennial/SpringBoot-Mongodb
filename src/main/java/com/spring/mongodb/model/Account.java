package com.spring.mongodb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    @Id
    long id;
    String accountNo;
    String accountType;
    String accountStatus;
    double balance;
}
