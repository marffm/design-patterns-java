package main.java.creational.prototypePattern;

import main.java.creational.prototypePattern.vehicle.Car;
import main.java.creational.prototypePattern.vehicle.Truck;

public class PrototypeApplication {

  public static void main(String[] args) {
    System.out.println("Prototype Pattern");

    Registry registry = new Registry();

    Car audi = (Car) registry.createVehicle("car");
    System.out.println(audi);

    Car bmw = (Car) registry.createVehicle("car");
    System.out.println(bmw);

    Truck scania = (Truck) registry.createVehicle("truck");
    System.out.println(scania);
  }
}
