import java.util.*;

public class lab4 {
    public static int accountNumber;
    public static String accountHolderName;
    public static double accountBalance;

    public static void main(String[] args) {
        ArrayList<String> transactions = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        customer(scanner);
        int choice;
        do {
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    depositMoney(scanner, transactions);
                    break;
                case 2:
                    withdrawMoney(scanner, transactions);
                    break;
                case 3:
                    printTransactions(transactions);
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void customer(Scanner scanner) {
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();
        System.out.print("Enter account balance: ");
        accountBalance = scanner.nextDouble();
    }

    public static void depositMoney(Scanner scanner, ArrayList<String> transactions) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        accountBalance += amount;
        String transaction = "Deposit of " + amount + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now();
        transactions.add(transaction);
    }

    public static void withdrawMoney(Scanner scanner, ArrayList<String> transactions) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > accountBalance) {
            System.out.println("Insufficient funds");
        } else {
            accountBalance -= amount;
            String transaction = "Withdrawal of " + amount + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now();
            transactions.add(transaction);
        }
    }

    public static void printTransactions(ArrayList<String> transactions) {
        System.out.println("Transaction history:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void printAccountSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }
}
