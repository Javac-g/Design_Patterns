package com.company.Lab5.Memento.Example;

public class Main {
    public static void main(String...args){
        Doc myDocument = new Doc();

        EditorHistory history = new EditorHistory();
        myDocument.addBock("Hello");
        myDocument.setStyle(5);
        myDocument.print();


        history.push(myDocument.saveState());

        myDocument.addBock("hi pal");
        myDocument.setStyle(2);
        myDocument.print();

        myDocument.restoreState(history.pop());
        myDocument.print();


    }
}
