package com.company.Lab5.State.Schedule;

public class TaskDevelopment implements TaskState{
    @Override
    public String getTaskStatusName() {
        return TaskStatusName.DEVELOPING.getName();
    }

    @Override
    public void nextTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskTesting());
    }

    @Override
    public void previousTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskCollecting());
    }
}
