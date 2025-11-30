public class Customer {
    private String custId;
    private String name;
    private String phone;
    private int loyaltyPoints;
    private List<Order> orderHistory;
    private List<Gift> receivedGifts;
    private List<Offer> activeOffers;
    
    public boolean registerLoyaltyProgram() { }
    public CustomerProfile viewProfile() { }
    public List<Order> viewOrderHistory() { }
    public List<Gift> viewReceivedGifts() { }
    public List<Offer> viewActiveOffers() { }
}
