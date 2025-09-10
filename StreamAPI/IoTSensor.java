import java.util.*;

class IoTSensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of readings: ");
        int n = sc.nextInt();

        List<Integer> readings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter sensor reading: ");
            readings.add(sc.nextInt());
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        System.out.println("\nReadings above threshold:");
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Reading: " + r));
    }
}
