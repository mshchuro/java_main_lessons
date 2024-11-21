package telran.lesson5;

public enum Connection {

    TESTCONNECTION1("google.com", "admin", "123"),
    TESTCONNECTION2("amazon.com", "admin", "123");

    private String url;

    private String user;

    private String password;

    Connection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
