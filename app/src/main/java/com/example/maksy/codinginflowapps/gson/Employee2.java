package com.example.maksy.codinginflowapps.gson;

import com.google.gson.annotations.Expose;

public class Employee2 {

    @Expose
    private String firstName;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private String email;

    private String password;

    public Employee2(String firstName, int age, String email, String password) {
        this.firstName = firstName;
        this.age = age;
        this.email = email;
        this.password = password;
    }
}
