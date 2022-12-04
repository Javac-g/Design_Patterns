package com.company.Lab5.Memento.Example;

public class Main {
    public static void main(String...args){
        Doc myDocument = new Doc();

        EditorHistory history = new EditorHistory();
        myDocument.addBock("Hello");
        myDocument.setStyle(2);
        myDocument.print();
        DocMemento memento = new DocMemento(myDocument.getText(), myDocument.getStyle());

        history.push(memento.saveState());

        myDocument.addBock("Hello");
        myDocument.setStyle(2);
        myDocument.print();


    }
}