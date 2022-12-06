package com.company.Lab5.Memento.PictureMemento;

import com.company.Lab5.Memento.Example.DocMemento;

import java.util.ArrayDeque;
import java.util.Queue;

public class History {

    private Queue<PictureMemento> history = new ArrayDeque<>();

    public History() {

    }

    public void push(PictureMemento memento){
        System.out.println("Saving picture configuration");
        history.offer(memento);
    }
    public PictureMemento pop(){
        System.out.println("Canceling last actions");
        return history.poll();
    }

}
