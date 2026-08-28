interface Notification{
    void send(String message);
}
class EmailNotification implements Notification{
    public void send(String message){
        System.out.println("Email sent = "+message);
    }
}

class SMSNotification implements Notification{
    public void send(String message){
        System.out.println("SMS sent = "+message);
    }
}
class PushNotification implements Notification{
    public void send(String message){
        System.out.println("Push notification sent = "+message);
    }
}
public class Java_Gpt_Test_Abs_6 {
    public static void main(String [] args){
        // E-Mail Notification
        Notification A = new EmailNotification();
        A.send("Hello");
        // SMS Notification
        A = new SMSNotification();
        A.send("Hello");
        // Push Notification
        A = new PushNotification();
        A.send("Hello");
    }
}
