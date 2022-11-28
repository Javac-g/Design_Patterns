package com.company.Lab3.Facade.Example;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    public void start(){
        cpu.freeze();
        memory.load();
        cpu.execute();
        hardDrive.read();
        cpu.jump();
    }
}
