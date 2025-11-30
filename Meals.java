public class Meal {
    private String mealId;
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean available;
    private List<String> ingredients;
    
    public Meal(String mealId, String name, String description, double price, String category) {
        this.mealId = mealId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.available = true;
        this.ingredients = new ArrayList<>();
    }
    
    public boolean updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            return true;
        }
        return false;
    }
    
    public boolean checkAvailability() {
        return available;
    }
    
    public boolean setAvailability(boolean available) {
        this.available = available;
        return true;
    }
    
    public boolean addIngredient(String ingredient) {
        return ingredients.add(ingredient);
    }
    
    public boolean removeIngredient(String ingredient) {
        return ingredients.remove(ingredient);
    }
    
    // Getters and Setters
    public String getMealId() { return mealId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public List<String> getIngredients() { return new ArrayList<>(ingredients); }
}
