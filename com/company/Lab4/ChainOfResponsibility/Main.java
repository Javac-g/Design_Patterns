package com.company.Lab4.ChainOfResponsibility;

import com.company.Lab4.ChainOfResponsibility.Example.Automate;
import com.company.Lab4.ChainOfResponsibility.Example.ReExam;
import com.company.Lab4.ChainOfResponsibility.Example.Student;
import com.company.Lab4.ChainOfResponsibility.Example.Usual;
import com.company.Lab4.ChainOfResponsibility.Sushi.*;

public class Main {
    public static void chainDemo(){


        Sushi sushi = new Sushi();

        sushi.setSushiType(SushiType.CALIFORNIA);


        JapanRecipe japanRecipe = new JapanRecipe(sushi);
        UkrainRecipe ukrainRecipe = new UkrainRecipe(sushi);
        UsaRecipe usaRecipe = new UsaRecipe(sushi);

        japanRecipe.setRecipe(ukrainRecipe);
        ukrainRecipe.setRecipe(usaRecipe);

        japanRecipe.createSushi();

    }
    public static void main(String...args){
        chainDemo();
    }
}
