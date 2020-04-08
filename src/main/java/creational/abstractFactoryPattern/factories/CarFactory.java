package main.java.creational.abstractFactoryPattern.factories;

import main.java.creational.abstractFactoryPattern.CarModels;
import main.java.creational.abstractFactoryPattern.cars.Car;

public abstract class CarFactory {

  public static CarFactory getCarFactory(Integer budget) {
    if (budget > 100) {
      return new LuxuryBrandFactory();
    }

    return new PopularBrandFactory();
  }

  public abstract Car getBrand(CarModels carModels);
}

