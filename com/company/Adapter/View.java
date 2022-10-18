package com.company.Adapter;

public class View {

    public void process(AlfaList alfaList){

        System.out.println("Current list state");

        alfaList.add(1);
        alfaList.add(2);
        alfaList.add(3);

        System.out.println("Elements");

        for(int i=0; i < alfaList.count();i++){

            System.out.println(alfaList.get(i));

        }
    }
}
