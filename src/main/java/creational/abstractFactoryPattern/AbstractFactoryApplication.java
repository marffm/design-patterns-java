package main.java.creational.abstractFactoryPattern;

import main.java.creational.abstractFactoryPattern.cars.Car;
import main.java.creational.abstractFactoryPattern.factories.CarFactory;

public class AbstractFactoryApplication {

  public static void main(String[] args) {
    System.out.println("Abstract Factory Pattern.");

    Car audi = CarFactory.getCarFactory(50).getBrand(CarModels.SPORT);
    System.out.println("Must be an audi: " + audi);

    Car volkswagen = CarFactory.getCarFactory(10).getBrand(CarModels.LUXURY);
    System.out.println("Must be a Volkswagen: " + volkswagen);

    Car jaguar = CarFactory.getCarFactory(120).getBrand(CarModels.LUXURY);
    System.out.println("Must be a Jaguar: " + jaguar);

    Car ferrari = CarFactory.getCarFactory(200).getBrand(CarModels.SPORT);
    System.out.println("Must be a Ferrari: " + ferrari);
  }

}
