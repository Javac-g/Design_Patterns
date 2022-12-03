package com.company.Lab4.Command.Example;

import java.util.HashMap;

public class SwitchInvoker {
    private final HashMap<String,Command> commands = new HashMap<>();
    public void register(String name,Command command){
        commands.put(name, command);
    }
    public void execute(String name){
        Command command = commands.get(name);
        if (command == null){
            System.out.println("Command not find");
            return;
        }
        command.execute();
    }
}
