package org.example._2_Factory_Pattern.SuperClass;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getCpu();
    public abstract String getDisk();

    @Override
    public String toString() {
        return "Ram " + this.getRam() + ", Cpu " + this.getCpu() + ", Disk " + this.getDisk();
    }
}
