import java.util.Scanner;

public class HandshakeCalculatr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes among " +
                numberOfStudents + " students is: " + handshakes);

        scanner.close();
    }
}

