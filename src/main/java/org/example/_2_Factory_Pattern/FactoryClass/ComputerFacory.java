package org.example._2_Factory_Pattern.FactoryClass;

import org.example._2_Factory_Pattern.SubClass.Laptop;
import org.example._2_Factory_Pattern.SubClass.PC;
import org.example._2_Factory_Pattern.SuperClass.Computer;

public class ComputerFacory {
    public static Computer getComputer(String type, String ram, String
            disk, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, disk, cpu);
        else if("Laptop".equalsIgnoreCase(type)) return new Laptop(ram,
                disk, cpu);
        return null;
    }
}
