package com.company.Lab3.Flyweight.Example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer,EnglishCharacter> characterMap = new HashMap<>();

    public EnglishCharacter getEnglishCharacter(int code){

        EnglishCharacter ob = characterMap.get(code);

        if(ob != null){
            System.out.println("Return " + ob.symbol + " from Flyweight cache");
            return ob;

        }

        switch (code){
            case 1:
                 ob = new CharacterA();
                break;
            case 2:
                ob = new CharacterB();
                break;
            case 3:
                ob = new CharacterC();
                break;
            default:
                System.out.println("Wrong code");
                return null;
        }
        characterMap.put(code,ob);
        System.out.println("Return " + ob.symbol + " from Flyweight cache");
        return ob;
    }
}
