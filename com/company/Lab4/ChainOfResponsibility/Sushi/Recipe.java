package com.company.Lab4.ChainOfResponsibility.Sushi;

public abstract class Recipe {

    protected Recipe recipe;


    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public abstract void createSushi();
}
