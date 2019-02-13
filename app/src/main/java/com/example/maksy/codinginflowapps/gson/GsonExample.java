package com.example.maksy.codinginflowapps.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maksy.codinginflowapps.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GsonExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson_example);

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

       // createJson(gson);

       // fromGson(gson);

        Employee2 employee2 = new Employee2(
                "John",
                30,
                "john@gmail.com",
                "adsqwe123"
        );

        String jsonResult = gson.toJson(employee2);
        String udpa = "";
    }

    private void fromGson(Gson gson) {
        String json = "[{\"age\":30,\"role\":\"wife\"},{\"age\":25,\"role\":\"mistress\"}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json,familyType);
        String dupa="";
        /*
        Employee employee = gson.fromJson(json,Employee.class);
        String dupa="";*/
    }

    private void createJson(Gson gson) {
        Address address = new Address("Germany", "Berlin");
        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(new FamilyMember("wife",30));
        familyMembers.add(new FamilyMember("mistress",25));
        Employee employee = new Employee("John", 30, "johm@pusyy.com", address,familyMembers);
        String json = gson.toJson(familyMembers);
        String dupa = "";
    }


}
