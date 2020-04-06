package main.java.creational.builderPattern.cards;

public class AdultCard implements Card {
  private String message;

  public AdultCard() {
    this.message = "This is a Adult message card.";
  }

  @Override
  public String getMessage() {
    return message;
  }
}
