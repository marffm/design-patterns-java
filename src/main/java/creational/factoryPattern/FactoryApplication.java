package main.java.creational.factoryPattern;

import main.java.creational.factoryPattern.computer.Computer;

public class FactoryApplication {

  public static void main(String[] args) {
    System.out.println("Factory Pattern");

    Computer gaming = ComputerFactory.getComputer(ComputerTypes.GAMING);
    Computer office = ComputerFactory.getComputer(ComputerTypes.OFFICE);

    System.out.println(gaming);
    System.out.println(office);
  }
}
