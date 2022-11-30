package com.company.Lab4.ChainOfResponsibility.Sushi;

public class UkrainRecipe extends Recipe{
    protected Sushi sushi;

    public UkrainRecipe(Sushi sushi) {
        this.sushi = sushi;
    }
    @Override
    public void createSushi() {
        if (sushi.getSushiType().equals(SushiType.KOZACKI)){
            sushi.setIngridients(new String[]{"Crab stick", "Sesamum","Cheese"});
            System.out.println("Created Ukrainian sushi");
        }else {
            getRecipe().createSushi();
        }
    }
}
