public class NotificationFactory {
    public Notification createNotification(String channel){
        if (channel==null ||channel.isEmpty()){
            return null;
        }
        if (channel.equals("SMS")){
            return new SMSNotification();
        }
        else if (channel.equals("EMAIL")){
            return new EmailNotification();
        }else if (channel.equals("PUSH")){
            return new PushNotification();
        }
        return null;
    }
}
