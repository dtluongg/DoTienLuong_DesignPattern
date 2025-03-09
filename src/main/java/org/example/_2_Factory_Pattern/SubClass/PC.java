package org.example._2_Factory_Pattern.SubClass;

import org.example._2_Factory_Pattern.SuperClass.Computer;

public class PC extends Computer {
    private String ram;
    private String cpu;
    private String disk;

    public PC(String ram, String cpu, String disk) {
        this.ram = ram;
        this.cpu = cpu;
        this.disk = disk;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getDisk() {
        return this.disk;
    }
}
