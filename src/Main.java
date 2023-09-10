import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client("Victor Kauan", "checking", 2000);
        AccountManager accountManager = new AccountManager(client);

        accountManager.printClient();

        String menu = """
                ================================
                Operations:
                                    
                1 - Check balance
                2 - Receive value
                3 - Transfer value
                4 - Exit
                ================================
                """;
        int option;
        boolean running = true;
        do {
            System.out.println(menu);

            System.out.println("< Option:");
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1 -> {
                        System.out.printf("> The client's current balance is R$ %.2f.%n".formatted(accountManager.checkBalance()));
                    }
                    case 2 -> {
                        System.out.println("< Enter the amount to receive in R$:");
                        double currentBalance = accountManager.receive(scanner.nextDouble());
                        System.out.printf("> The updated balance is R$ %.2f.%n".formatted(currentBalance));
                    }
                    case 3 -> {
                        System.out.println("< Enter the amount to transfer in R$:");
                        double currentBalance = accountManager.transfer(scanner.nextDouble());
                        System.out.printf("> The updated balance is R$ %.2f.%n".formatted(currentBalance));
                    }
                    case 4 -> {
                        running = false;
                    }
                    default -> {
                        throw new Exception("Invalid operation");
                    }
                }
            } catch (Exception exception) {
                System.out.println("> [ERROR] " + exception.getMessage());
            }
        } while (running);

        scanner.close();
        System.out.println("Program terminated.");
    }
}
