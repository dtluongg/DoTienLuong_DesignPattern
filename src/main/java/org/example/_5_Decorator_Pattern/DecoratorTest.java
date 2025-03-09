package org.example._5_Decorator_Pattern;

import org.example._5_Decorator_Pattern.ConcreteDecorator.BasicCar;
import org.example._5_Decorator_Pattern.ConcreteDecorator.LuxuryCar;
import org.example._5_Decorator_Pattern.ConcreteDecorator.SuperCar;
import org.example._5_Decorator_Pattern.Interface.Car;

public class DecoratorTest {
    public static void main(String[] args) {

        Car superCar = new SuperCar(new BasicCar());
        superCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SuperCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
