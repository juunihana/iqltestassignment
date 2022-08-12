package com.iql.testassignment.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;

    private String name;

    private LocalDate dateOfBirth;

    private String password;

    private double account;

    private List<String> emails;

    private List<String> phones;
}
