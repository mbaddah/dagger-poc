package com.dagger.eg01;

import dagger.Component;

import javax.inject.Singleton;

//@Component - interface used to generate injector and build out objects
//@Singleton - must give same scope to our component as module
@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    Car buildCar();
}
