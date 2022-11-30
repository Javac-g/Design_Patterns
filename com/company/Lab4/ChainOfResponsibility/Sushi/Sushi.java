package com.company.Lab4.ChainOfResponsibility.Sushi;

public class Sushi {
    private String[] ingridients;
    private SushiType sushiType;

    public String[] getIngridients() {
        return ingridients;
    }

    public void setIngridients(String[] ingridients) {
        this.ingridients = ingridients;
    }

    public SushiType getSushiType() {
        return sushiType;
    }

    public void setSushiType(SushiType sushiType) {
        this.sushiType = sushiType;
    }
}
