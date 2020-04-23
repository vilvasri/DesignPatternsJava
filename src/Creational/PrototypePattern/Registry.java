package Creational.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItem();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItem() {
        Movie movie = new Movie();
        movie.setTitle("Bahubali");
        movie.setPrice(30.00);
        movie.setRunTime("2 hours");

        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setPrice(500.00);
        book.setNumOfPages(300);

        items.put("Movie", movie);
        items.put("Book", book);
    }
}
