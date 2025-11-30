public class Order {
    private String orderId;
    private Customer customer;
    private List<Meal> meals;
    private Date orderDate;
    private String status;
    private String orderType; // DINE_IN, TAKEAWAY, DELIVERY
    private Employee createdBy;
    
    public Order(String orderId, Customer customer, List<Meal> meals,Employee createdBy) {
        this.orderId = orderId;
        this.customer = customer;
        this.meals = new ArrayList<>(meals);
        this.orderDate = new Date();
        this.status = "PENDING";
        this.orderType = "DINE_IN";
        this.createdBy = createdBy;
    }
    
    public double calculateTotal() {
        return meals.stream()
                .mapToDouble(Meal::getPrice)
                .sum();
    }
    
    public boolean updateStatus(String newStatus) {
        this.status = newStatus;
        return true;
    }
    
    public boolean addMeal(Meal meal) {
        return meals.add(meal);
    }
    
    public boolean removeMeal(Meal meal) {
        return meals.remove(meal);
    }
    
    public int getMealCount() {
        return meals.size();
    }
    
    // Getters and Setters
    public String getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<Meal> getMeals() { return new ArrayList<>(meals); }
    public Date getOrderDate() { return orderDate; }
    public String getStatus() { return status; }
    public String getOrderType() { return orderType; }
}
