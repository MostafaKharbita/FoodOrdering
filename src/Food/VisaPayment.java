package Food;

public class VisaPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Visa.");
    }
}
