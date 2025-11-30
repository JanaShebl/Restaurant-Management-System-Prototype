public class Employee extends User {
    private String empId;
    private String position;
    
    // Customer Management
    public boolean addCustomer(Customer cust) { }
    public boolean deleteCustomer(String custId) { }
    public boolean updateCustomer(Customer cust) { }
    public List<Customer> listCustomers() { }
    public Customer searchCustomer(String criteria) { }
    
    // Order Management
    public Order makeOrder(Customer cust, List<Meal> meals) { }
    public boolean cancelOrder(String orderId) { }
    
    // Billing
    public Bill generateBill(Order order) { }
    public boolean processPayment(Bill bill) { }
}
