package creational.builderPattern;

import creational.builderPattern.cards.Card;
import creational.builderPattern.decorations.Decoration;
import creational.builderPattern.products.Product;

public class GiftBuilder {

  private Product product;

  private Decoration decoration;

  private Card card;

  public GiftBuilder builder(Product product) {
    this.product = product;
    return this;
  }

  public GiftBuilder builder(Decoration decoration) {
    this.decoration = decoration;
    return this;
  }

  public GiftBuilder builder(Card card) {
    this.card = card;
    return this;
  }

  public Gift build(){
    GiftImplementation giftImplementation = new GiftImplementation(product, decoration, card);

    this.product = null;
    this.decoration = null;
    this.card = null;

    return giftImplementation;
  }

}
