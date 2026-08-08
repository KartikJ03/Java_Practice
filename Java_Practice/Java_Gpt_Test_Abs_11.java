interface NotificationService{
    void sendMessage(String message);
    void sendAlert(String alert);
    String getServiceName();
}
class EmailService implements NotificationService{
    String email;
    public EmailService(String email){
        this.email = email;
    }
    public void sendMessage(String message){
        System.out.println("Email message to "+email+" : "+message);
    }
    public void sendAlert(String alert){
        System.out.println("Email alert to "+email+" : "+alert);
    }
    public String getServiceName(){
        return "Email Service:-";
    }
}
class SMSService implements NotificationService{
    String phoneNumber;
    public SMSService(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void sendMessage(String message){
        System.out.println("SMS message to "+phoneNumber+" : "+message);
    }
    public void sendAlert(String alert){
        System.out.println("SMS alert to "+phoneNumber+" : "+alert);
    }
    public String getServiceName(){
            return "SMS Service:-";
    }
}
class PushService implements NotificationService{
    String deviceID;
    public PushService(String deviceID){
        this.deviceID = deviceID;
    }
    public void sendMessage(String message){
        System.out.println("Push message to "+deviceID+" : "+message);
    }
    public void sendAlert(String alert){
        System.out.println("Push alert to "+deviceID+" : "+alert);
    }
    public String getServiceName(){
        return "Push Service:-";
    }
}
public class Java_Gpt_Test_Abs_11 {
    public static void main(String [] args){
        // Email
        NotificationService service = new EmailService("kartik@gmail.com");
        System.out.println(service.getServiceName());
        service.sendMessage("Hello");
        service.sendAlert("Service is down");
        System.out.println();

        // SMS Service
        service = new SMSService("9876543210");
        System.out.println(service.getServiceName());
        service.sendMessage("Hello");
        service.sendAlert("Server is down");
        System.out.println();

        //Push Service
        service = new PushService("Device123");
        System.out.println(service.getServiceName());
        service.sendMessage("Hello");
        service.sendAlert("Server is down");

    }
}
