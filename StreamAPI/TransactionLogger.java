import java.util.*;
import java.time.LocalDateTime;

class TransactionLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> transactionIds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction ID: ");
            transactionIds.add(sc.nextLine());
        }

        System.out.println("\nLogging Transactions:");
        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " - Transaction ID: " + id));
    }
}
