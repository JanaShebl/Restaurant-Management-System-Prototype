public class Employee extends User {
    private String employeeId;
    private String position;
    private double salary;
    private Date hireDate;
    private List<Customer> managedCustomers;
    
    public Employee(String userId, String username, String password, String email, String phone, String employeeId) {
        super(userId, username, password, email, phone);
        this.employeeId = employeeId;
        this.position = "Staff";
        this.hireDate = new Date();
        this.managedCustomers = new ArrayList<>();
    }
    public boolean addCustomer(Customer customer) {
        return managedCustomers.add(customer);
    }
    
    public List<Customer> getManagedCustomers() {
        return new ArrayList<>(managedCustomers);
    }
    
    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    @Override
    public void logout() {
        System.out.println("Employee logged out: " + username);
    }
    
    // Customer Management
    public boolean addCustomer(Customer customer) {
        // Implementation
        return true;
    }
    
    public boolean deleteCustomer(String customerId) {
        // Implementation
        return true;
    }
    
    public boolean updateCustomer(Customer customer) {
        // Implementation
        return true;
    }
    
    public List<Customer> listCustomers() {
        // Implementation
        return new ArrayList<>();
    }
    
    public Customer searchCustomer(String criteria) {
        // Implementation
        return null;
    }
    
    // Order Management
    public Order createOrder(Customer customer, List<Meal> meals) {
        Order order = new Order(generateOrderId(), customer, meals);
        // Implementation
        return order;
    }
    
    public boolean cancelOrder(String orderId) {
        // Implementation
        return true;
    }
    
    // Billing
    public Bill processBill(Order order) {
        Bill bill = new Bill(generateBillId(), order);
        // Implementation
        return bill;
    }
    
    private String generateOrderId() {
        return "ORD" + System.currentTimeMillis();
    }
    
    private String generateBillId() {
        return "BIL" + System.currentTimeMillis();
    }
}
