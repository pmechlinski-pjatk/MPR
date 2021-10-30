package com.pjatkway.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("sandwich")
public class sandwichService {
    public static Sandwich prepareSandwich(String super_sandwich) {
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient bread = new Ingredient();
        ingredients.add(bread);
        return new Sandwich(1, "White Bread");
    }

    public Sandwich prepareSandwich(){
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient bread = new Ingredient();
        ingredients.add(bread);
        return new Sandwich();
    }
}

/*
Co to jest @Repository
Co  to jest @JPARepository
Jak stworzyć @Repository
Jak zapisywać do bazy danych
Jak odczytywać z bazy danych
 */