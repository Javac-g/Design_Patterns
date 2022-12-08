package com.company.Lab5.State.Schedule;

public class TaskDone implements TaskState{
    @Override
    public String getTaskStatusName() {
        return TaskStatusName.DONE.getName();
    }

    @Override
    public void nextTaskStatus(TaskContext taskContext) {
        System.out.println("Nothins happens");
    }

    @Override
    public void previousTaskStatus(TaskContext taskContext) {
        taskContext.setTaskState(new TaskTesting());
    }
}
