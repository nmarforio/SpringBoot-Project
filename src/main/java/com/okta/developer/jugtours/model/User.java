package com.okta.developer.jugtours.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data 
@NoArgsConstructor // this create no parameters constructor (if you have final(field), is not possible) unless (force = True)
@AllArgsConstructor // create 1 parameter for each field in your class, if you use @NonNull is null
@Entity
@Table(name = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
}