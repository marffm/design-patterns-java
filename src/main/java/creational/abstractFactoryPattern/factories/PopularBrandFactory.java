package main.java.creational.abstractFactoryPattern.factories;

import main.java.creational.abstractFactoryPattern.CarModels;
import main.java.creational.abstractFactoryPattern.cars.Audi;
import main.java.creational.abstractFactoryPattern.cars.Car;
import main.java.creational.abstractFactoryPattern.cars.Volkswagen;

public class PopularBrandFactory extends CarFactory {
  @Override
  public Car getBrand(CarModels carModels) {

    switch (carModels){
      case SPORT:
        return new Audi();
      case LUXURY:
        return new Volkswagen();
      default:
        return null;
    }

  }
}
