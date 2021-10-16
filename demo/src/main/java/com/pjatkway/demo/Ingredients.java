package com.pjatkway.demo;

public class Ingredients {
    String name;
    double price;
    int calories;
    IngredientType IngredientType;

    Ingredients(String name, double price, int calories, IngredientType type) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.IngredientType = type;
    }

    public Ingredients() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public com.pjatkway.demo.IngredientType getIngredientType() {
        return IngredientType;
    }

    public void setIngredientType(com.pjatkway.demo.IngredientType ingredientType) {
        IngredientType = ingredientType;
    }
}
