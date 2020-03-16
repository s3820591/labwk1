import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Celsius: " );
        double Celsius = input.nextDouble();
        double Fahrenheit = (9.0 / 5) * Celsius + 32;
        System.out.println("Fahrenheit is: "+ Fahrenheit);
    }
}
