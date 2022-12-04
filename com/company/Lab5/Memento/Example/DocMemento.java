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
    public DocMemento saveState(){
        System.out.println("Saving document");
        return new DocMemento(text,style);
    }
    public void restoreState(DocMemento memento){
        text = memento.getText();
        style = memento.getStyle();
    }
}
