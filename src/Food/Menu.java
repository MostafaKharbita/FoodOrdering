package Food;

public class Menu {
    private FoodItem[] items = {
            new FoodItem(1, "Pizza", 150),
            new FoodItem(2, "Burger", 120),
            new FoodItem(3, "Cola", 30)
    };

    public void displayMenu() {
        System.out.println("===== MENU =====");
        for (FoodItem item : items) {
            item.show();
        }
    }

    public FoodItem getItem(int id) {
        for (FoodItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
