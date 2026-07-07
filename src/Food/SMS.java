package Food;

public class SMS implements Notification{
    @Override
    public void sendNotify(){
        System.out.println("SMS notification sent.");
    }
}
