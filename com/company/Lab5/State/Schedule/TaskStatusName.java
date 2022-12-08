package com.company.Lab5.State.Schedule;

public enum TaskStatusName {
    COLLECTING("Collecting of requirements"),
    DEVELOPING("Development current task"),
    TESTING("Testing current task"),
    DONE("Task is done");

    private String name;

    TaskStatusName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
