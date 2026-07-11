package Food;

public class FoodItemBuilder {

    private int id;
    private String name;
    private double price;

    public FoodItemBuilder id(int id) {
        this.id = id;
        return this;
    }

    public FoodItemBuilder name(String name) {
        this.name = name;
        return this;
    }

    public FoodItemBuilder price(double price) {
        this.price = price;
        return this;
    }

    public FoodItem build() {
        return new FoodItem(id, name, price);
    }
}
