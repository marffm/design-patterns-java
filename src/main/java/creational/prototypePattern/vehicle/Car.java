package main.java.creational.prototypePattern.vehicle;

public class Car extends Vehicle {

  private Integer maximumSpeed;

  public Car(String model, String brand, String size, Integer maximumSpeed) {
    super(model, brand, size);
    this.maximumSpeed = maximumSpeed;
  }

  public void setMaximumSpeed(Integer maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
  }

  public Integer getMaximumSpeed() {
    return maximumSpeed;
  }
}
