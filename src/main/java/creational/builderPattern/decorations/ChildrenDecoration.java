package main.java.creational.builderPattern.decorations;

public class ChildrenDecoration implements Decoration {
  private final String decoration;

  public ChildrenDecoration() {
    this.decoration = "Adult decoration";
  }

  @Override
  public String getDecoration() {
    return decoration;
  }
}
