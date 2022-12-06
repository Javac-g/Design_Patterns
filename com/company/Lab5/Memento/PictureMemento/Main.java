package com.company.Lab5.Memento.PictureMemento;

public class Main {
    public static void main(String...args){
        Picture picture = new Picture();
        History history = new History();

        picture.setBrightness(25);
        picture.setContrast(55);
        picture.setSharpness(22);

        history.push(picture.saveSetting());

        picture.setBrightness(90);
        picture.setContrast(90);
        picture.setSharpness(90);
        picture.restoreSetting(history.pop());
        picture.print();
    }
}
