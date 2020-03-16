import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        final double CONVERSION_RATE = 1.609;
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("%2d\t\t %5.2f\t\t|\t\t%d \t\t%.2f%n",
                    mile, mile * CONVERSION_RATE, 15 + mile * 5, (15 + mile * 5) / CONVERSION_RATE);
        }
    }
}
