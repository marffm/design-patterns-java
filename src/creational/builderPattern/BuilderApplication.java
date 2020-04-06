package creational.builderPattern;

import creational.builderPattern.cards.AdultCard;
import creational.builderPattern.cards.ChildrenCard;
import creational.builderPattern.decorations.AdultDecoration;
import creational.builderPattern.decorations.ChildrenDecoration;
import creational.builderPattern.products.GamingPc;
import creational.builderPattern.products.Shoes;
import creational.builderPattern.products.Toy;

public class BuilderApplication {

  public static void main(String[] args) {
    System.out.println("Builder pattern.");

    GiftBuilder giftBuilder = new GiftBuilder();

    giftBuilder.builder(new AdultCard());
    giftBuilder.builder(new AdultDecoration());
    giftBuilder.builder(new Shoes());
    Gift adultGift = giftBuilder.build();

    giftBuilder.builder(new ChildrenCard());
    giftBuilder.builder(new ChildrenDecoration());
    giftBuilder.builder(new Toy());
    Gift childrenGift = giftBuilder.build();


    giftBuilder.builder(new GamingPc());
    Gift mySelfGift = giftBuilder.build();

    System.out.println("Adult gift");
    System.out.println(adultGift.getDecoration().getDecoration());
    System.out.println(adultGift.getCard().getMessage());
    System.out.println(adultGift.getProduct().getProduct());

    System.out.println("Children gift");
    System.out.println(childrenGift.getDecoration().getDecoration());
    System.out.println(childrenGift.getCard().getMessage());
    System.out.println(childrenGift.getProduct().getProduct());

    System.out.println("A gift for myself.");
    System.out.println(mySelfGift.getDecoration());
    System.out.println(mySelfGift.getCard());
    System.out.println(mySelfGift.getProduct().getProduct());

  }

}
