package com.company.Lab4.ChainOfResponsibility.Sushi;

public class JapanRecipe extends Recipe {

    protected Sushi sushi;

    public JapanRecipe(Sushi sushi) {
        this.sushi = sushi;
    }

    @Override
    public void createSushi() {
        if (sushi.getSushiType().equals(SushiType.RED_DRAGON)){
            sushi.setIngridients(new String[]{"Rice", "fish","Wasabi"});
            System.out.println("Created Japanese sushi");
        }else {
            getRecipe().createSushi();
        }
    }
}
