public abstract class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String email;
    protected String phone;
    
    // Constructor
    public User(String userId, String username, String password, String email, String phone) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }
    
    // Abstract methods
    public abstract boolean login(String username, String password);
    public abstract void logout();
    
    // Concrete methods
    public boolean updateProfile(String email, String phone) {
        this.email = email;
        this.phone = phone;
        return true;
    }
    
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
    
    // Getters and Setters
    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
