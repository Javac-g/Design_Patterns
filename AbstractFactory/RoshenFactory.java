package AbstractFactory;

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
