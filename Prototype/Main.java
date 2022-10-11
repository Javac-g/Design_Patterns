package Prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String...args) throws CloneNotSupportedException {

        Second second = new Second();
        second.setValue(2000);

        ArrayList<Second> secondsLists = new ArrayList<>();
        for(int  i = 0;i<5;i++){
            Second second1 = new Second();
            second1.setValue(i);
            secondsLists.add(second1);

        }
        First first = new First();
        first.setSecond(second);
        first.setValue(50000);
        first.setSecondList(secondsLists);

        First first1 = (First)first.clone();
        first1.getSecond().setValue(15000);

        System.out.println(first);
        System.out.println(first1);
    }
}
