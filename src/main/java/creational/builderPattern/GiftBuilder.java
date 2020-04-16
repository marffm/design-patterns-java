package main.java.creational.builderPattern;

import main.java.creational.builderPattern.cards.Card;
import main.java.creational.builderPattern.decorations.Decoration;
import main.java.creational.builderPattern.products.Product;

public class GiftBuilder {

  private Product product;

  private Decoration decoration;

  private Card card;

  public GiftBuilder product(Product product) {
    this.product = product;
    return this;
  }

  public GiftBuilder decoration(Decoration decoration) {
    this.decoration = decoration;
    return this;
  }

  public GiftBuilder card(Card card) {
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
