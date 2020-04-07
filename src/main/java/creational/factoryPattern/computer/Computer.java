package main.java.creational.factoryPattern.computer;

import main.java.creational.factoryPattern.interfaces.computer.parts.GraphicCard;
import main.java.creational.factoryPattern.interfaces.computer.parts.MotherBoard;
import main.java.creational.factoryPattern.interfaces.computer.parts.Processor;
import main.java.creational.factoryPattern.interfaces.computer.parts.Storage;

public abstract class Computer {
  private MotherBoard motherboard;
  private Processor processor;
  private Storage storage;
  private GraphicCard graphicCard;

  public Computer(MotherBoard motherboard, Processor processor, Storage storage, GraphicCard graphicCard) {
    this.motherboard = motherboard;
    this.processor = processor;
    this.storage = storage;
    this.graphicCard = graphicCard;
  }

  @Override
  public String toString() {
    return "Computer{" +
            "motherboard=" + motherboard +
            ", processor=" + processor +
            ", storage=" + storage +
            ", graphicCard=" + graphicCard +
            '}';
  }
}
