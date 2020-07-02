import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int min = num1;
        int max = num2;
        if (num1 > num2) {
            min = num2 ; max = num1;
        }
        if (num3 < min)
            System.out.println(num3 + ", " + min + ", " + max);
        else if (num3 > max)
            System.out.println(min + ", " + max + ", " + num3);
        else
            System.out.println(min + ", " + num3 + ", " + max);



    }

}
