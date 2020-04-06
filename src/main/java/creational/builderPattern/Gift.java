package main.java.creational.builderPattern;

import main.java.creational.builderPattern.cards.Card;
import main.java.creational.builderPattern.decorations.Decoration;
import main.java.creational.builderPattern.products.Product;

public interface Gift {
  public Product getProduct();
  public Decoration getDecoration();
  public Card getCard();
}
