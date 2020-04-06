package creational.builderPattern;

import creational.builderPattern.cards.Card;
import creational.builderPattern.decorations.Decoration;
import creational.builderPattern.products.Product;

public class GiftImplementation implements Gift {

  private Product product;

  private Decoration decoration;

  private Card card;

  public GiftImplementation(
          Product product,
          Decoration decoration,
          Card card) {
    this.product = product;
    this.decoration = decoration;
    this.card = card;
  }

  @Override
  public Product getProduct() {
    return product;
  }

  @Override
  public Decoration getDecoration() {
    return decoration;
  }

  @Override
  public Card getCard() {
    return card;
  }
}
