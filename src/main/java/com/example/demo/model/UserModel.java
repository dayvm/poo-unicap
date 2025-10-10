package com.example.demo.model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import lombok.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue
    long id;
    String username;
    String password;
    int age;
}
