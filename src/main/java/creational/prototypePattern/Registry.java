package main.java.creational.prototypePattern;

import main.java.creational.prototypePattern.vehicle.Car;
import main.java.creational.prototypePattern.vehicle.Truck;
import main.java.creational.prototypePattern.vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Registry {
  private Map<String, Vehicle> vehicleMap;

  public Registry() {
    loadVehicles();
  }

  public Vehicle createVehicle(String type) {
    try {
      return (Vehicle)(vehicleMap.get(type)).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  private void loadVehicles() {
    Car car = new Car("", "", "", 0);
    Truck truck = new Truck("", "", "", 0);

    vehicleMap = new HashMap<>();
    vehicleMap.put("car", car);
    vehicleMap.put("truck", truck);
  }
}
