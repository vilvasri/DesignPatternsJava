package Creational;

public class BuilderPattern {
    public static void main(String[] args) {
        Burger.Builder builder = new Burger.Builder();
        builder.bread("Wheat").meat("beef").cheese("Swiss").sauce("Mayo").toppings("Chili");
        Burger burger = builder.build();
        System.out.println(burger.getBread());
        System.out.println(burger.getSauce());
    }
}

class Burger {
    static class Builder {
        private String bread;
        private String meat;
        private String cheese;
        private String sauce;
        private String toppings;

        Builder() {}

        Burger build() {
            return new Burger(this);
        }

        Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
        Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }
        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        Builder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }
        Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
    }

    private final String bread;
    private final String meat;
    private final String cheese;
    private final String sauce;
    private final String toppings;

    private Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat  = builder.meat;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    String getBread() {
        return bread;
    }
    String getMeat() {
        return meat;
    }
    String getCheese() {
        return cheese;
    }
    String getSauce() {
        return sauce;
    }
    String getToppings() {
        return toppings;
    }
}