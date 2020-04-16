package main.java.structural.adapterPattern.food;

public class Fruit {
  private final String name;
  private final Integer energy;
  private final Integer sugar;

  public Fruit(String name, Integer energy, Integer sugar) {
    this.name = name;
    this.energy = energy;
    this.sugar = sugar;
  }

  public String getName() {
    return name;
  }

  public Integer getEnergy() {
    return energy;
  }

  public Integer getSugar() {
    return sugar;
  }
}
