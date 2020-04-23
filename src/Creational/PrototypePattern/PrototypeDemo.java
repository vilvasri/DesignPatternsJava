package Creational.PrototypePattern;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie mv1 = (Movie) registry.createItem("Movie");
        mv1.setTitle("Star wars");

        Movie mv2 = (Movie) registry.createItem("Movie");
        mv2.setTitle("Robot");
        mv2.setPrice(20.00);

        System.out.println(mv1);
        System.out.println(mv1.getTitle());
        System.out.println(mv1.getRunTime());
        System.out.println(mv1.getPrice());

        System.out.println(mv2);
        System.out.println(mv2.getTitle());
        System.out.println(mv2.getRunTime());
        System.out.println(mv2.getPrice());
    }
}

/* Output:
Creational.PrototypePattern.Movie@7ef20235
Star wars
2 hours
30.0
Creational.PrototypePattern.Movie@6f496d9f
Robot
2 hours
20.0
 */