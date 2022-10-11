package Factory;

public class BlackChocolateCandy implements Candy {
    static {
        System.out.println("Black chocolate candy created");
    }
    private String ingridients = "black chocolate, cream , strawberry";
    @Override
    public void printComponents() {
        System.out.println("Black Chocolate Candy ingridients: " + ingridients);
    }
}
