package com.company.Prototype;

public class Second {
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Second second = new Second();
        second.setValue(this.getValue());
        return second;
    }

    @Override
    public String toString() {
        return "Value: " + value;
    }
}
