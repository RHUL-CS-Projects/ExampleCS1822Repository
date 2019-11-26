
public class Restaurant {
    String name;
    String cuisine;

    public class Restaurant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
    }

    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
}
