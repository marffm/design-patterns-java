package main.java.structural.adapterPattern;

import main.java.structural.adapterPattern.food.Food;
import main.java.structural.adapterPattern.food.Fruit;

public class FruitAdapter implements Food {

  private Fruit instance;

  public FruitAdapter(Fruit instance) {
    this.instance = instance;
  }

  @Override
  public String getName() {
    return instance.getName();
  }

  @Override
  public Integer getCalories() {
    return instance.getEnergy();
  }

  @Override
  public Integer getCarbohydrates() {
    return instance.getSugar();
  }
}
