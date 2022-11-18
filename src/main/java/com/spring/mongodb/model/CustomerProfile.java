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
public class CustomerProfile {

    @Id
    long id;
    String city;
    String state;
    String address;
    String phone;
    String gender;
}
