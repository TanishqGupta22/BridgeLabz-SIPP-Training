import java.util.Scanner;
public class calc_kilometertomile {
        public static void main(String[] args) {
            double km;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter distance in kilometers: ");
            km = input.nextInt();  // You can also use input.nextDouble() for decimal input

            double miles = km / 1.6;

            System.out.println("The distance " + km + " km in miles is " + miles);
        }
    }


