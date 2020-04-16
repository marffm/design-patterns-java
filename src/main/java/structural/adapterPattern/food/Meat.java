package main.java.structural.adapterPattern.food;

public class Meat implements Food {
  private String name;
  private Integer calories;
  private Integer carbohydrates;

  public Meat(String name, Integer calories, Integer carbohydrates) {
    this.name = name;
    this.calories = calories;
    this.carbohydrates = carbohydrates;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getCalories() {
    return calories;
  }

  @Override
  public Integer getCarbohydrates() {
    return carbohydrates;
  }
}
