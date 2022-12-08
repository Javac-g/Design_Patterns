package com.company.Lab5.State.Schedule;

public class TaskTesting implements TaskState{
    @Override
    public String getTaskStatusName() {
        return TaskStatusName.TESTING.getName();
    }

    @Override
    public void nextTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskDone());
    }

    @Override
    public void previousTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskDevelopment());
    }
}
