package com.company.Lab4.Command.TrafficLight;


import java.util.HashMap;

public class Registrator {
    private final HashMap<String,Command> commands = new HashMap<>();
    public void register(String name, Command command){
        commands.put(name, command);
    }
    public void execute(String name){
        Command command = commands.get(name);
        if (command == null){
            System.out.println("Command not find");
            return;
        }
        command.process();
    }
}
