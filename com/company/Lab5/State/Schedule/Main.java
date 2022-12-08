package com.company.Lab5.State.Schedule;

public class Main {
    public static void main(String...args){
        TaskContext taskContext = new TaskContext();
        taskContext.setTaskState(new TaskCollecting());
        System.out.println(taskContext.getTaskStatusName());
        taskContext.nextTaskStatus();
        System.out.println(taskContext.getTaskStatusName());
        taskContext.nextTaskStatus();
        System.out.println(taskContext.getTaskStatusName());
        taskContext.previousTaskStatus();
        System.out.println(taskContext.getTaskStatusName());
        taskContext.nextTaskStatus();
        System.out.println(taskContext.getTaskStatusName());
        taskContext.nextTaskStatus();
        System.out.println(taskContext.getTaskStatusName());
    }
}
