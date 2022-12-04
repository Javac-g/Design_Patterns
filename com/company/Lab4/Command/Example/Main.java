package com.company.Lab4.Command.Example;

public class Main {
    public static void main(String...args){
        Reciver lamp = new Reciver();
        Command on = new SwitchOn(lamp);
        Command off = new SwitchOff(lamp);
        SwitchInvoker switchInvoker = new SwitchInvoker();
        switchInvoker.register("on",on);
        switchInvoker.register("off",off);
        switchInvoker.execute("on");
        switchInvoker.execute("off");

    }
}
