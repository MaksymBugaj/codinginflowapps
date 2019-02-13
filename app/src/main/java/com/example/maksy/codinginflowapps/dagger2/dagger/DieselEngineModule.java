package com.example.maksy.codinginflowapps.dagger2.dagger;

import com.example.maksy.codinginflowapps.dagger2.car.DieselEngine;
import com.example.maksy.codinginflowapps.dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
