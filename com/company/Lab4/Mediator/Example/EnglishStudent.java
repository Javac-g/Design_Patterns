package com.company.Lab4.Mediator.Example;

public class EnglishStudent implements Student{
    @Override
    public String getName() {
        return "John";
    }

    @Override
    public LangType getLangType() {
        return LangType.ENGLISH;
    }

    @Override
    public void communicate() {
        new LangMediator(this).executeCommunication();
    }
}
