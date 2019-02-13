package com.example.maksy.codinginflowapps.dagger2.car;

import android.util.Log;

import com.example.maksy.codinginflowapps.dagger2.car.Engine;

import javax.inject.Inject;

import static com.example.maksy.codinginflowapps.dagger2.car.Car.TAG;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "petrtol start: ");
    }
}
