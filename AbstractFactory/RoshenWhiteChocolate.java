package AbstractFactory;

public class RoshenWhiteChocolate implements WhiteChocolate{
    private String ingredients = "White chocolate, nuts,raspberry";
    public RoshenWhiteChocolate() {
        System.out.println("Created Roshen White Chocolate");
    }
    @Override
    public void printIngredients(){
        System.out.println("Roshen white chocolate consist of: " + ingredients);
    }
}
