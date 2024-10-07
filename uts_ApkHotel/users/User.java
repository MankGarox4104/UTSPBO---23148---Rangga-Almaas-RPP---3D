package uts_ApkHotel.users;

public class User implements AksesUser {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean isAdmin() {
        return "admin".equalsIgnoreCase(role);
    }

    @Override
    public boolean isCustomer() {
        return "customer".equalsIgnoreCase(role);
    }
}