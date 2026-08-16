import java.util.List;

public class Notification {
    
    private List<String> notifications;

    public void addNotification(String notification) {
        notifications.add(notification);
    }

    public List<String> getNotifications() {
        return notifications;
    }   
}
