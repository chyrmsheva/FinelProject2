package company.model;

public class Manager {
    private String username = "Aksana";
     private String password = "12345";

    public Manager() {
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "Manager{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
