package rest;

public class User {

    private int id;
    private String userName;
    private String ini;
    private String cpr;
    private String password;
    private String role;

    public User() {
    }
    public User(int id, String userName, String ini, String cpr, String password, String role) {
        this.id = id;
        this.userName = userName;
        this.ini = ini;
        this.cpr = cpr;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIni() {
        return ini;
    }

    public void setIni(String ini) {
        this.ini = ini;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
