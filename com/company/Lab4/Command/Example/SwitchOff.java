package com.company.Lab4.Command.Example;

public class SwitchOff implements Command{
    private final Reciver ligh;

    public SwitchOff(Reciver ligh) {
        this.ligh = ligh;
    }

    @Override
    public void execute() {
        ligh.turnOff();
    }
}
