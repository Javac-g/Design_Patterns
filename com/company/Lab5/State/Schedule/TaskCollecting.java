package com.company.Lab5.State.Schedule;

public class TaskCollecting implements TaskState{
    @Override
    public String getTaskStatusName() {
        return TaskStatusName.COLLECTING.getName();
    }

    @Override
    public void nextTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskDevelopment());
    }

    @Override
    public void previousTaskStatus(TaskContext taskContext) {
        System.out.println("Nothing happens");
    }
}
