package main.java.creational.abstractFactoryPattern.factories;

import main.java.creational.abstractFactoryPattern.CarModels;
import main.java.creational.abstractFactoryPattern.cars.Car;
import main.java.creational.abstractFactoryPattern.cars.Ferrari;
import main.java.creational.abstractFactoryPattern.cars.Jaguar;

public class LuxuryBrandFactory extends CarFactory {
  @Override
  public Car getBrand(CarModels carModels) {

    switch (carModels){
      case SPORT:
        return new Ferrari();
      case LUXURY:
        return new Jaguar();
      default:
        return null;
    }

  }
}
