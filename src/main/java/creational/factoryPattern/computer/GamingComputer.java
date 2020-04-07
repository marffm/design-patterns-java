package main.java.creational.factoryPattern.computer;

import main.java.creational.factoryPattern.interfaces.computer.parts.GraphicCard;
import main.java.creational.factoryPattern.interfaces.computer.parts.MotherBoard;
import main.java.creational.factoryPattern.interfaces.computer.parts.Processor;
import main.java.creational.factoryPattern.interfaces.computer.parts.Storage;

public class GamingComputer extends Computer {

  public GamingComputer(MotherBoard engine, Processor processor, Storage storage, GraphicCard graphicCard) {
    super(engine, processor, storage, graphicCard);
  }

  public void playGames(){}
}
