public class Client {
    private String fullName;
    private String accountType;
    private double accountBalance;

    public Client(String fullName, String accountType, double accountBalance) {
        this.fullName = fullName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
