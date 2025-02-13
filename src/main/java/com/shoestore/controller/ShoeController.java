package com.shoestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ShoeController {
    private Map<Integer, Shoe> shoeStore = new HashMap<>();

    public ShoeController() {
        shoeStore.put(1, new Shoe(1, "Air Max", "Nike", 120.00, 10));
        shoeStore.put(2, new Shoe(2, "UltraBoost", "Adidas", 180.00, 5));
    }

    @GetMapping("/shoes")
    public Collection<Shoe> getAllShoes() {
        return shoeStore.values();
    }

    @GetMapping("/shoes/{id}")
    public Shoe getShoe(@PathVariable int id) {
        return shoeStore.get(id);
    }
}

class Shoe {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int stock;

    public Shoe(int id, String name, String brand, double price, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
}