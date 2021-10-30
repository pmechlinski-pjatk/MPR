package com.pjatkway.demo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
// poczytać o:
// RestController
// Service
// Wstrzykiwanie zależności
// DLE CHĘTNYCH poczytać o postman

@Entity
@Table(name = "Sandwich")
public class Sandwich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    int calories;
    double price = 1;
    @OneToMany
    private List<Ingredient> ingredients;
    int ingredientsNumber =0;
    boolean isVegetarian;

    public Sandwich() {

    }

/*    void isVege(this.ingredients) {
        for ( x : ingredients ) {

        }
    }*/
    /*void AddIngredient(Ingredients x) {
        this.ingredients.add(x.name);
        this.ingredientsNumber +=1;
        this.calories += x.calories;
        this.price += x.price;
        if (x.IngredientType.equals("Meat")) {
            this.isVegetarian = false;
        }
    }*/

    Sandwich(int ID, List<Ingredient> x) {
        this.id = ID;
        this.calories = 0;
        this.price = 1;
        this.ingredientsNumber = 0;
        this.isVegetarian = true;
    }

    public Sandwich(int id, String ingredients) {
    }

    public Integer getId() {
        return id;
    }

    public Integer getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public int getIngredientsNumber() {
        return ingredientsNumber;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setIngredientsNumber(int ingredientsNumber) {
        this.ingredientsNumber = ingredientsNumber;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
