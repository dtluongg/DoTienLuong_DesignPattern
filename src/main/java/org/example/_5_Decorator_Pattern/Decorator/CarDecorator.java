package org.example._5_Decorator_Pattern.Decorator;

import org.example._5_Decorator_Pattern.Interface.Car;

public class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    @Override
    public void assemble() {
        this.car.assemble(); // Delegate cho component
    }
}
