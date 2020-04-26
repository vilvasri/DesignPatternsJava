package Creational.FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    public List<Page> getPages() {
        return pages;
    }

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
