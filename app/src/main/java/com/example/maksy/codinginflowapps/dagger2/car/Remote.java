package com.example.maksy.codinginflowapps.dagger2.car;

import android.util.Log;

import com.example.maksy.codinginflowapps.dagger2.car.Car;

import javax.inject.Inject;

import static com.example.maksy.codinginflowapps.dagger2.car.Car.TAG;

public class Remote {

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "remote connected: ");
    }
}
