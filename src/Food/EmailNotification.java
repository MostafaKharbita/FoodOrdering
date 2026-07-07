package Food;

public class EmailNotification implements Notification {
    @Override
    public void sendNotify(){
        System.out.println("Email notification sent.");
    }
}
