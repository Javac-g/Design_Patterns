package AbstractFactory;

public class MilleniumFactory implements CandyFactory{
    @Override
    public BlackChocolate createBlackChocolate() {
        return new MilleniumBlackChocolate();
    }

    @Override
    public WhiteChocolate createWhiteChocolate() {
        return new MilleniumWhiteChocolate();
    }
}
