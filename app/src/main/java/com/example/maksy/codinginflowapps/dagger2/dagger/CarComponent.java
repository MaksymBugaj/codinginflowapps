package com.example.maksy.codinginflowapps.dagger2.dagger;

import com.example.maksy.codinginflowapps.dagger2.MainDagger;
import com.example.maksy.codinginflowapps.dagger2.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainDagger mainDagger);
}
