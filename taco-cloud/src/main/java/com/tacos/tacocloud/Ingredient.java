package com.tacos.tacocloud;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final String type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
