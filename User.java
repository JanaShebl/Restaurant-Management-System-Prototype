public abstract class User {
    protected int userId;
    protected String username;
    protected String password;
    
    // Constructor
    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
    
    // Abstract methods
    public abstract boolean login(String username, String password);
    public abstract void logout();
    
    // Concrete methods
        public void updateInfo(String username, String password) {
        this.username = username;
        this.password = password;
 
    }
    
    // public boolean changePassword(String oldPassword, String newPassword) {
    //     if (this.password.equals(oldPassword)) {
    //         this.password = newPassword;
    //         return true;
    //     }
    //     return false;
    // }
    
    // Getters and Setters
    public int getUserId() { return userId; }
    public String getUsername() { return username; }
}
