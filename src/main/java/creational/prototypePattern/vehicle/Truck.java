package main.java.creational.prototypePattern.vehicle;

public class Truck extends Vehicle {
  private Integer maxLoad;

  public Truck(String model, String brand, String size, Integer maxLoad) {
    super(model, brand, size);
    this.maxLoad = maxLoad;
  }

  public Integer getMaxLoad() {
    return maxLoad;
  }

  public void setMaxLoad(Integer maxLoad) {
    this.maxLoad = maxLoad;
  }
}
