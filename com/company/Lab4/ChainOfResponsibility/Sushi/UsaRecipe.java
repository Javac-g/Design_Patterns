package com.company.Lab4.ChainOfResponsibility.Sushi;

public class UsaRecipe extends Recipe{
    protected Sushi sushi;

    public UsaRecipe(Sushi sushi) {
        this.sushi = sushi;
    }
    @Override
    public void createSushi() {
        if (sushi.getSushiType().equals(SushiType.CALIFORNIA)){
            sushi.setIngridients(new String[]{"Bakon", "fish","Cucumber"});
            System.out.println("Created USA sushi");
        }else {
            getRecipe().createSushi();
        }
    }
}
