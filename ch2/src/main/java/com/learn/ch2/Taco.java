package com.learn.ch2;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;

    private List<Ingredient> ingredients;
}
