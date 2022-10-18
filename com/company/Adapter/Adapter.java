package com.company.Adapter;

public class Adapter implements AlfaList  {

    private BetaList betaList;

    public Adapter(BetaList betaList) {
        this.betaList = betaList;
    }

    @Override
    public void add(int value) {
        betaList.addVlue(value);
    }

    @Override
    public int get(int index) {
        return betaList.getValue(index);
    }

    @Override
    public int count() {
        return betaList.elementsCount();
    }
}
