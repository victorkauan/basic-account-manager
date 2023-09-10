public class AccountManager {
    private final Client client;

    public AccountManager(Client client) {
        this.client = client;
    }

    public void printClient() {
        System.out.printf("""
                ================================
                Client information:
                                
                - Full name: %s
                - Account type: %s
                - Balance: R$ %.2f
                ================================
                %n""".formatted(client.getFullName(), client.getAccountType(), client.getAccountBalance()));
    }

    public double checkBalance() {
        return client.getAccountBalance();
    }

    public double receive(double value) {
        double currentClientBalance = client.getAccountBalance();

        client.setAccountBalance(currentClientBalance + value);
        return client.getAccountBalance();
    }

    public double transfer(double value) throws Exception {
        double currentClientBalance = client.getAccountBalance();

        if (value > currentClientBalance) {
            throw new Exception("Insufficient balance to make the transfer");
        }

        client.setAccountBalance(currentClientBalance - value);
        return client.getAccountBalance();
    }
}
