package com.example.maksy.codinginflowapps.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String email, Address address,List<FamilyMember> familyMembers) {
        mFirstName = firstName;
        mAge = age;
        mEmail = email;
        mAddress = address;
        mFamily = familyMembers;
    }
}
