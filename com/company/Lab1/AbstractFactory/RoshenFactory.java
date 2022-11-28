package com.company.Lab1.AbstractFactory;

public class RoshenFactory implements CandyFactory {
    @Override
    public BlackChocolate createBlackChocolate() {
        return new RoshenBlackChocolate();
    }

    @Override
    public WhiteChocolate createWhiteChocolate() {
        return new RoshenWhiteChocolate();
    }
}
