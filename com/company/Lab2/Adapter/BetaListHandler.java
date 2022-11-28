package com.company.Lab2.Adapter;

import java.util.LinkedList;
import java.util.List;

public class BetaListHandler implements BetaList{
    private static final List<Integer> list = new LinkedList<>();

    @Override
    public void addVlue(int value) {
        list.add(value);
    }

    @Override
    public int getValue(int index) {
        return list.get(index);
    }

    @Override
    public int elementsCount() {
        return list.size();
    }
}
