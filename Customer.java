public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private int loyaltyPoints;
    private double totalSpent;
    private List<Order> orderHistory;
    
    public Customer(String customerId, String name, String address, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.loyaltyPoints = 0;
        this.totalSpent = 0.0;
        this.orderHistory = new ArrayList<>();
    }
    
    public boolean registerLoyaltyProgram() {
        // Implementation
        return true;
    }
    
    public List<Order> viewOrderHistory() {
        return new ArrayList<>(orderHistory);
    }
    
    public boolean addOrderToHistory(Order order) {
        return orderHistory.add(order);
    }
    
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    
    public boolean addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        return true;
    }
    
    public boolean redeemPoints(int points) {
        if (points <= loyaltyPoints) {
            this.loyaltyPoints -= points;
            return true;
        }
        return false;
    }
    
    // Getters and Setters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public double getTotalSpent() { return totalSpent; }
}
