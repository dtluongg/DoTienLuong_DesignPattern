package org.example._5_Decorator_Pattern.ConcreteDecorator;

import org.example._5_Decorator_Pattern.Interface.Car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car."); // Lắp ráp một chiếc xe cơ bản
    }
}
