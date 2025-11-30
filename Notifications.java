public class Notification {
    private String notificationId;
    private String userId;
    private String message;
    private String type; // OFFER, GIFT, ORDER_UPDATE, SYSTEM
    private Date sentDate;
    private boolean isRead;
    
    public Notification(String notificationId, String userId, String message, String type) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.type = type;
        this.sentDate = new Date();
        this.isRead = false;
    }
    
    public boolean send() {
        // Implementation for sending notification
        System.out.println("Notification sent to user " + userId + ": " + message);
        return true;
    }
    
    public boolean markAsRead() {
        this.isRead = true;
        return true;
    }
    
    public static List<Notification> getNotificationsForUser(String userId) {
        // Implementation to get user notifications
        return new ArrayList<>();
    }
    
    // Getters
    public String getNotificationId() { return notificationId; }
    public String getUserId() { return userId; }
    public String getMessage() { return message; }
    public String getType() { return type; }
    public Date getSentDate() { return sentDate; }
    public boolean isRead() { return isRead; }
}
