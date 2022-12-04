package com.company.Lab5.Memento.Example;

public class Doc {
    private String text = "";
    private int style = -1;

    public void addBock(String text){
        this.text += text + "\n";
        System.out.println("Added block " + text);
    }
    public void setStyle(int style){
        if (this.style != style){
            this.style = style;
        }
        System.out.println("Style set: \n" + style);
    }
    public void print(){
        System.out.println("\nStyle: " + style + "\nText: " + text
        );
    }

    public String getText() {
        return text;
    }

    public int getStyle() {
        return style;
    }
}
