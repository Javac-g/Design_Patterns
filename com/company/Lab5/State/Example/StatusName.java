package com.company.Lab5.State.Example;

public enum StatusName {
    NEW("New"),
    SEND("Sended"),
    DELIVERED("Delivered");
    private String statusName;

    StatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
