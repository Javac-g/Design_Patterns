package com.company.Lab4.Command.Example;

public class SwitchOn implements Command{
    private final Reciver light;

    public SwitchOn(Reciver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
