package main.java.creational.factoryPattern;

import main.java.creational.factoryPattern.computer.Computer;
import main.java.creational.factoryPattern.computer.GamingComputer;
import main.java.creational.factoryPattern.computer.OfficeComputer;
import main.java.creational.factoryPattern.computer.parts.*;

public abstract class ComputerFactory {

  public static Computer getComputer(ComputerTypes type) {
    switch (type) {

      case GAMING:
        return new GamingComputer(
                new MotherBoardGaming(),
                new IntelI9(),
                new SSD(),
                new GamingGraphicCard()
        );

      case OFFICE:
        return new OfficeComputer(
                new MotherBoardDefault(),
                new IntelI5(),
                new HDD(),
                null
        );

      default:
        return null;
    }
  }
}
