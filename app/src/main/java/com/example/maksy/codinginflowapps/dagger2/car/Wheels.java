package com.example.maksy.codinginflowapps.dagger2.car;

public class Wheels {
//dont own, cant annotate
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
