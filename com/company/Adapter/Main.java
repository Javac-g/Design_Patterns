package com.company.Adapter;

public class Main {
    public static void main(String...args){

        AlfaListHandler alfaListHandler = new AlfaListHandler();
        BetaListHandler betaListHandler = new BetaListHandler();
        Adapter adapter = new Adapter(betaListHandler);

        View view = new View();

        view.process(alfaListHandler);
        view.process(adapter);

    }
}
