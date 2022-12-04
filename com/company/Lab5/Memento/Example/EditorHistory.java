package com.company.Lab5.Memento.Example;

import java.util.ArrayDeque;
import java.util.Queue;

public class EditorHistory {
    private Queue<DocMemento> history = new ArrayDeque<>();
    public void  push(DocMemento memento){
        System.out.println("Saving doc");
        history.offer(memento);
    }
    public DocMemento pop(){
        System.out.println("Canceling last actions");
        return history.poll();
    }
}
