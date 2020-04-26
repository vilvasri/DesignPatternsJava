package Creational.FactoryPattern;

public class Blog extends Website{

    @Override
    protected void createWebsite() {
        pages.add(new Contactpage());
        pages.add(new CommentPage());
    }
}
