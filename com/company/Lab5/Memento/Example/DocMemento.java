package com.company.Lab5.Memento.Example;

public class DocMemento {
    private String text;
    private int style;

    public DocMemento(String text, int style) {
        this.text = text;
        this.style = style;
    }

    public String getText() {
        return text;
    }

    public int getStyle() {
        return style;
    }

}
