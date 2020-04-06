package creational.builderPattern;

import creational.builderPattern.cards.Card;
import creational.builderPattern.decorations.Decoration;
import creational.builderPattern.products.Product;

public interface Gift {
  public Product getProduct();
  public Decoration getDecoration();
  public Card getCard();
}
