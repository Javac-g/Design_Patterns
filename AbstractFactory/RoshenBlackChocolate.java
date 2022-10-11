package AbstractFactory;

public class RoshenBlackChocolate implements BlackChocolate{
    private String ingredients = "Cocoa mass,soybean";
    public RoshenBlackChocolate() {
        System.out.println("Created Roshen Black Chocolate");
    }

    @Override
    public void printIngredients() {
        System.out.println("Roshen Black Chocolate consists of: " + ingredients);
    }
}
