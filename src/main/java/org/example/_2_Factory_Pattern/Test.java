package org.example._2_Factory_Pattern;

import org.example._2_Factory_Pattern.FactoryClass.ComputerFacory;
import org.example._2_Factory_Pattern.SuperClass.Computer;

public class Test {
    public static void main(String[] args){
        Computer pc = ComputerFacory.getComputer("PC", "8GB", "120GB SSD + 500GB HDD", "P9000");
        Computer laptop = ComputerFacory.getComputer("Laptop", "16GB", "512GB SSD ", "R5 5500U");
        System.out.println("PC của tôi có cấu hình: "+pc);
        System.out.println("Laptop của tôi có cấu hình: "+laptop);
    }
}
