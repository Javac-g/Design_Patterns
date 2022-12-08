package com.company.Lab5.State.Schedule;

public class TaskContext {
    private TaskState taskState;

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public void nextTaskStatus(){
        taskState.nextTaskStatus(this);
    }
    public void previousTaskStatus(){
        taskState.previousTaskStatus(this);
    }
    public String getTaskStatusName(){
        return taskState.getTaskStatusName();
    }
}
