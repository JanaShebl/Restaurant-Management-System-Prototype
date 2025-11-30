public abstract class User {
    protected String userId;
    protected String username;
    protected String password;
    protected String email;
    
    public abstract boolean login(String username, String password);
    public abstract void logout();
    public abstract boolean updateInfo();
    public boolean changePassword(String oldPass, String newPass) {
        // implementation
    }
}
