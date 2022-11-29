package com.company.Lab3.Flyweight.Example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer,EnglishCharacter> characterMap = new HashMap<>();

    public EnglishCharacter getEnglishCharacter(int code){

        EnglishCharacter ob = characterMap.get(code);

        if(ob != null){

            return ob;

        }

        switch (code){
            case 1:
                 ob = new CharacterA();
                characterMap.put(1,ob);
                break;
            case 2:
                ob = new CharacterB();
                characterMap.put(2,ob);
                break;
            case 3:
                ob = new CharacterC();
                characterMap.put(3,ob);
                break;
            default:
                System.out.println("Wrong code");
                return null;
        }
        return ob;
    }
}
