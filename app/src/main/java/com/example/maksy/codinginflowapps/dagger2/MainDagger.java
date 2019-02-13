package com.example.maksy.codinginflowapps.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maksy.codinginflowapps.R;
import com.example.maksy.codinginflowapps.dagger2.car.Car;
import com.example.maksy.codinginflowapps.dagger2.dagger.CarComponent;

import javax.inject.Inject;

public class MainDagger extends AppCompatActivity {
    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dagger);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        mCar.drive();
    }
}
