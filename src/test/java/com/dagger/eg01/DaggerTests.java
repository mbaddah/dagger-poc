package com.dagger.eg01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DaggerTests {

    @Test
    void  givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {

        //Component implementation is same name as interface prefixed with 'Dagger'
        VehiclesComponent component = DaggerVehiclesComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        assertNotNull(carOne);
        assertNotNull(carTwo);
        assertNotNull(carOne.getEngine());
        assertNotNull(carTwo.getEngine());

        assertNotNull(carOne.getBrand());
        assertNotNull(carTwo.getBrand());

        assertNotNull(carOne.getWheel());
        assertNotNull(carTwo.getWheel());

        assertNotEquals(carOne.getEngine(), carTwo.getEngine());

        assertEquals(carOne.getBrand(), carTwo.getBrand());
    }
}
