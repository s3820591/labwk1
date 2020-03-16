import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n, A, S = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("A= ");
        A = input.nextInt();
        while (A > 0) {
            n = A % 10;
            A = A / 10;
            S += n;
        }
        System.out.println("S= " + S);
    }
}
