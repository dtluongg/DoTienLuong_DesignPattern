package org.example._5_Decorator_Pattern.ConcreteDecorator;

import org.example._5_Decorator_Pattern.Decorator.CarDecorator;
import org.example._5_Decorator_Pattern.Interface.Car;

public class SuperCar extends CarDecorator {

    public SuperCar(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble(); // Gọi phương thức của component
        System.out.print(" Adding features of Sports Car."); // Thêm chức năng
    }
}
