package main.java.creational.builderPattern.cards;

public class ChildrenCard implements Card {
  private String message;

  public ChildrenCard() {
    this.message = "This is a children message gift";
  }

  @Override
  public String getMessage() {
    return message;
  }
}
