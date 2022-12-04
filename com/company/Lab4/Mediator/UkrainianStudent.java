package com.company.Lab4.Mediator;

public class UkrainianStudent implements Student{
    @Override
    public String getName() {
        return "Maxym";
    }

    @Override
    public LangType getLangType() {
        return LangType.UKRAINIAN;
    }

    @Override
    public void communicate() {
        new LangMediator(this).executeCommunication();
    }
}
