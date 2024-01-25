package com.revature.jpa.springrestjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email ;
    private int phone;

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
