package Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        Order order = new Order();

        int choice;

        do {
            menu.displayMenu();

            System.out.print("Choose Item ID you want to add ---- if you finished uour odere choose  (0 to Finish): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    order.addItem(menu.getItem(1));
                    break;

                case 2:
                    order.addItem(menu.getItem(2));
                    break;

                case 3:
                    order.addItem(menu.getItem(3));
                    break;

                case 0:
                    System.out.println("Order Completed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        order.printSum();

        // Payment
        System.out.println("\nChoose Payment Method");
        System.out.println("1. Visa");
        System.out.println("2. Wallet");

        int paymentChoice = input.nextInt();

        switch (paymentChoice) {
            case 1:
                order.pay(new VisaPayment());
                break;

            case 2:
                order.pay(new WalletPayment());
                break;

            default:
                System.out.println("Invalid Payment Method!");
        }

        // Notification
        System.out.println("\nChoose Notification");
        System.out.println("1. Email");
        System.out.println("2. SMS");

        int notifyChoice = input.nextInt();

        switch (notifyChoice) {
            case 1:
                order.notifyCustomer(new EmailNotification());
                break;

            case 2:
                order.notifyCustomer(new SMS());
                break;

            default:
                System.out.println("Invalid Notification!");
        }


          
        input.close();
    }
}