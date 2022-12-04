package com.company.Lab4.Iterator.MusicList;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicIterator {
    public static void main(String...args){
        ArrayList<String> compositions = new ArrayList<>();

        compositions.add("Adele - Hello");
        compositions.add("Rihanna - Work");
        compositions.add("Alan Walker - Dark side");
        compositions.add("M83 - Wait");
        compositions.add("David Guetta - Titanium");
        compositions.add("Bob Sinclar - Love Generation");
        compositions.add("Pharrell Williams - Happy");
        compositions.add("Bruno Mars - Uptown Funk");
        compositions.add("Peter Hollens - Dragonborn");
        compositions.add("Zedd - Happy Now");

        Iterator<String> iterator = compositions.iterator();

            while(iterator.hasNext()){

                String song = iterator.next();

                System.out.println("Played: " + song);

            }

    }

}
