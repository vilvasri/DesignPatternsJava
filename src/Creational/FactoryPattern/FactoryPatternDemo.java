package Creational.FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());

        Website website1 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website1.getPages());
    }

}
