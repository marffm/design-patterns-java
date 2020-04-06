package main.java.creational.prototypePattern.vehicle;

public abstract class Vehicle implements Cloneable {

  private String model;

  private String brand;

  private String size;

  public Vehicle(String model, String brand, String size) {
    this.model = model;
    this.brand = brand;
    this.size = size;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
