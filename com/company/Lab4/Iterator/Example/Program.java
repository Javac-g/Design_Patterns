package com.company.Lab4.Iterator.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public static void main(String...args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Germany");
        arrayList.add("France");
        arrayList.add("Ukraine");
        arrayList.add("Italy");
        arrayList.add("Spain");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String elem = iterator.next().toUpperCase();
            System.out.println(elem);
        }
    }
}
