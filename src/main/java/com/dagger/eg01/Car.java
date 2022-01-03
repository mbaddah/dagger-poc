package com.dagger.eg01;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Brand brand;
    private Wheel wheel;

    //Constructor dependencies injected
    @Inject
    public Car(Engine engine, Brand brand, Wheel wheel) {
        this.engine = engine;
        this.brand = brand;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
