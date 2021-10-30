package com.pjatkway.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {
    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich() {

        return ResponseEntity.ok(sandwichService.prepareSandwich("SUPER SANDWICH"));
    }
}