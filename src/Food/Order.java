package Food;
import java.util.ArrayList;

public class Order {

private ArrayList<FoodItem> selectedItems = new ArrayList<>();
public void addItem(FoodItem item){
    selectedItems.add(item);
}
public double calcTotal(){
    double total = 0;
    for (FoodItem item : selectedItems) {
        total += item.getPrice();
    }
    return total ;
}
    public void printSum() {

        System.out.println("===== Order Summary =====");

        boolean[] printed = new boolean[selectedItems.size()];

        for (int i = 0; i < selectedItems.size(); i++) {

            if (printed[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < selectedItems.size(); j++) {

                if (selectedItems.get(i).getId() == selectedItems.get(j).getId()) {
                    count++;
                    printed[j] = true;
                }
            }

            System.out.println(
                    selectedItems.get(i).getName() +
                            " x" + count +
                            " : $" + selectedItems.get(i).getPrice()
            );
        }

        System.out.println("-------------------------");
        System.out.println("Total = $" + calcTotal());
    }
    public void pay(Payment payment) {
        payment.pay(calcTotal());
    }

    public void notifyCustomer(Notification notification) {
        notification.sendNotify();
    }

}
