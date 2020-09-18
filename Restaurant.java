
public class Restaurant {
    private String name;
    private String cuisine;
    private String address;

    public class Restaurant(String name,
                            String cuisine,
                            String address) {
        this.name = name;
        this.cuisine = cuisine;
        this.address = address;
    }

    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
    public String getAddress() { return address; }
}
