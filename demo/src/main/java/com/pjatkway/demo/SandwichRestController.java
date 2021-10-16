package com.pjatkway.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich() {

        Ingredients WhiteBread = new Ingredients("White Bread", 5, 200, IngredientType.Bread);
        Ingredients GrainedBread = new Ingredients("Grained Bread", 5, 200, IngredientType.Bread);
        Ingredients DarkBread = new Ingredients("Dark Bread", 5, 200, IngredientType.Bread);

        Ingredients Cheese = new Ingredients("Cheese", 5, 200, IngredientType.Vegemeat);
        Ingredients Tomato = new Ingredients("Tomato", 5, 200, IngredientType.Vegetable);
        Ingredients Salad = new Ingredients("Salad", 5, 200, IngredientType.Vegetable);

        Ingredients Salami = new Ingredients("Salami", 5, 200, IngredientType.Meat);
        Ingredients Bacon = new Ingredients("Bacon", 5, 200, IngredientType.Meat);
        Ingredients Chicken = new Ingredients("Chicken", 5, 200, IngredientType.Meat);

        List<Ingredients> listIngredients = new ArrayList<>();
        listIngredients.add(WhiteBread);
        listIngredients.add(Cheese);
        listIngredients.add(Salami);

        Sandwich poorMans = new Sandwich(1, listIngredients);


        return ResponseEntity.ok(poorMans);
    }
}