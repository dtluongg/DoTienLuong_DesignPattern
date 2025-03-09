package org.example._5_Decorator_Pattern.ConcreteDecorator;

import org.example._5_Decorator_Pattern.Decorator.CarDecorator;
import org.example._5_Decorator_Pattern.Interface.Car;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }
    @Override
    public void assemble() {
        super.assemble(); // Gọi phương thức của component
        System.out.print(" Adding features of Luxury Car."); // Thêm chức năng
    }
}
