package Food;

public class Menu {

    private FoodItem[] items = {

            new FoodItemBuilder()
                    .id(1)
                    .name("Pizza")
                    .price(150)
                    .build(),

            new FoodItemBuilder()
                    .id(2)
                    .name("Burger")
                    .price(120)
                    .build(),

            new FoodItemBuilder()
                    .id(3)
                    .name("Cola")
                    .price(30)
                    .build()
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