public class Bill {
    private String billId;
    private Order order;
    private double totalAmount;
    private double tax;
    private double discount;
    private String paymentStatus;
    private Date billDate;
    
    public Bill(String billId, Order order) {
        this.billId = billId;
        this.order = order;
        this.totalAmount = order.calculateTotal();
        this.tax = calculateTax();
        this.discount = 0.0;
        this.paymentStatus = "PENDING";
        this.billDate = new Date();
    }
    
    public double calculateTotal() {
        return totalAmount + tax - discount;
    }
    
    private double calculateTax() {
        return totalAmount * 0.14; // 14% tax
    }
    
    public boolean applyDiscount(double discountAmount) {
        if (discountAmount >= 0 && discountAmount <= totalAmount) {
            this.discount = discountAmount;
            return true;
        }
        return false;
    }
    
    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice ID: ").append(billId).append("\n");
        invoice.append("Order ID: ").append(order.getOrderId()).append("\n");
        invoice.append("Customer: ").append(order.getCustomer().getName()).append("\n");
        invoice.append("Subtotal: $").append(String.format("%.2f", totalAmount)).append("\n");
        invoice.append("Tax: $").append(String.format("%.2f", tax)).append("\n");
        invoice.append("Discount: $").append(String.format("%.2f", discount)).append("\n");
        invoice.append("Total: $").append(String.format("%.2f", calculateTotal())).append("\n");
        return invoice.toString();
    }
    
    public boolean processPayment(Payment payment) {
        if (payment.processPayment(calculateTotal())) {
            this.paymentStatus = "PAID";
            return true;
        }
        return false;
    }
    
    // Getters and Setters
    public String getBillId() { return billId; }
    public Order getOrder() { return order; }
    public double getTotalAmount() { return totalAmount; }
    public String getPaymentStatus() { return paymentStatus; }
}
