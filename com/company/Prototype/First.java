package com.company.Prototype;

import java.util.ArrayList;
import java.util.List;

public class First {
    private int value;
    private Second second;
    private List<Second> secondList= new ArrayList<>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public List<Second> getSecondList() {
        return secondList;
    }

    public void setSecondList(List<Second> secondList) {
        this.secondList = secondList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        First first = new First();
        first.setValue(this.getValue());
        first.setSecond((Second) this.getSecond().clone());

        ArrayList arraylist = new ArrayList();
        for (Second x: this.secondList){
            arraylist.add(x.clone());
        }
        first.setSecondList(arraylist);
        return first;
    }

    @Override
    public String toString() {
      return   "First { " + "\nValue: " + value + "\nSecond: " + second+ "\nSecondList: " + secondList + "\n}";
    }
}
