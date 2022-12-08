package com.company.Lab5.State.Schedule;

public interface TaskState {
    String getTaskStatusName();
    void nextTaskStatus(TaskContext taskContext);
    void previousTaskStatus(TaskContext taskContext);
}
