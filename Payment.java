public class Payment {
    private String paymentId;
    private Bill bill;
    private double amount;
    private String paymentMethod; // CASH, CARD, DIGITAL_WALLET
    private Date paymentDate;
    private String status;
    private String transactionId;
    
    public Payment(String paymentId, Bill bill, String paymentMethod) {
        this.paymentId = paymentId;
        this.bill = bill;
        this.amount = bill.calculateTotal();
        this.paymentMethod = paymentMethod;
        this.paymentDate = new Date();
        this.status = "INITIATED";
    }
    
    public boolean processPayment(double amount) {
        // Simulate payment processing
        if (amount > 0) {
            this.status = "COMPLETED";
            this.transactionId = "TXN" + System.currentTimeMillis();
            return true;
        }
        this.status = "FAILED";
        return false;
    }
    
    public boolean refund() {
        if ("COMPLETED".equals(status)) {
            this.status = "REFUNDED";
            return true;
        }
        return false;
    }
    
    public boolean validatePayment() {
        return amount > 0 && 
               bill != null && 
               !paymentMethod.isEmpty() &&
               ("CASH".equals(paymentMethod) || "CARD".equals(paymentMethod) || "DIGITAL_WALLET".equals(paymentMethod));
    }
    
    // Getters and Setters
    public String getPaymentId() { return paymentId; }
    public Bill getBill() { return bill; }
    public double getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getStatus() { return status; }
    public String getTransactionId() { return transactionId; }
}
