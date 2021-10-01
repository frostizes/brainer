package com.example.NoBrainer.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName =  "customer_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public Customer(Long id, String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    @Override
    public String toString(){
        return firstName+" "+lastName+" "+email;
    }
}
