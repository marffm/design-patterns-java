package main.java.structural.adapterPattern;

import main.java.structural.adapterPattern.food.Food;
import main.java.structural.adapterPattern.food.Fruit;
import main.java.structural.adapterPattern.food.Meat;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternApplication {

  public static void main(String[] args) {
    System.out.println("--- Adapter Pattern ---");

    List<Food> foodList = new ArrayList<>();
    foodList.add(new Meat("chicken", 115, 2));

    Fruit apple = new Fruit("apple", 80, 25);
    foodList.add(new FruitAdapter(apple));

    System.out.println(foodList);
  }

}
