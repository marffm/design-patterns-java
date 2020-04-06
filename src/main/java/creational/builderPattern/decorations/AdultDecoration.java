package main.java.creational.builderPattern.decorations;

public class AdultDecoration implements Decoration {

  private final String decoration;

  public AdultDecoration() {
    this.decoration = "Adult decoration";
  }

  @Override
  public String getDecoration() {
    return decoration;
  }
}
