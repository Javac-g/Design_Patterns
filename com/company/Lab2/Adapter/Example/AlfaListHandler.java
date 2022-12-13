package com.company.Lab2.Adapter.Example;

import java.util.ArrayList;
import java.util.List;

public class AlfaListHandler implements AlfaList{

  private final static  List<Integer> list = new ArrayList<>();

    @Override
    public int get(int index) {

        return list.get(index);

    }

    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public int count() {
        return list.size();
    }
}
