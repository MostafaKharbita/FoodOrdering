package Food;

public class FoodItem {
    private String name;
    private int id;
    private double price;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        System.out.println(id + " - " + name + " : $" + price);
    }
}
