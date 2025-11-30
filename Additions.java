public class Meal {
    private String mealId;
    private String name;
    private String description;
    private double price;
    private String category;
    // getters & setters
}

public class Order {
    private String orderId;
    private Customer customer;
    private List<Meal> meals;
    private Date orderDate;
    private String status;
    private double totalAmount;
    // methods
}

public class Bill {
    private String billId;
    private Order order;
    private double totalAmount;
    private double tax;
    private double discount;
    private Date paymentDate;
    // methods
}

public class Notification {
    private String notifId;
    private String message;
    private String type;
    private Date timestamp;
    
    public void sendNotification(User user, String message) { }
    public void setGiftAlert(Customer cust, double amountThreshold) { }
}
