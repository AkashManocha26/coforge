public class User {
    private int userId;
    private String userName;
    private float userSalary;

    public User(int userId, String userName, float userSalary) {
        this.userId = userId;
        this.userName = userName;
        this.userSalary = userSalary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(float userSalary) {
        this.userSalary = userSalary;
    }
}
