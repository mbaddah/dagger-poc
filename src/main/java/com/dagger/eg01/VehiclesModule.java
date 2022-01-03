package com.dagger.eg01;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

//@Module class will provide/build object dependencies
@Module
public class VehiclesModule {

    //@Provides annotation will construct dependencies
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    //Singleton object
    @Provides
    @Singleton
    public Brand provideBrand() {
        return new Brand();
    }

    @Provides
    public Wheel provideWheel() {
        return new Wheel();
    }



}
