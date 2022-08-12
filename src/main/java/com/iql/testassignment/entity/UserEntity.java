package com.iql.testassignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private LocalDate dateOfBirth;

    private String password;

    @OneToOne(mappedBy = "user")
    private AccountEntity account;

    @OneToMany(mappedBy = "user")
    private List<EmailEntity> emailList;

    @OneToMany(mappedBy = "user")
    private List<PhoneEntity> phoneList;
}
