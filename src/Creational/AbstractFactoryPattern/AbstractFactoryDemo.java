package Creational.AbstractFactoryPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(643);
        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card1.getClass());
    }
}
