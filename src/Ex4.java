import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num3, num1, num2, max, min;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if (num1 < num2)
            min = num1;
        else min = num2;
        if (num1 < num2)
            max = num2;
        else max = num1;
        if (num3 < min)
            System.out.println(num3 + "," + min + "," + max);
        else if (num3 > max)
            System.out.println(min + "," + max + "," + num3);
        else
            System.out.println(min + "," + num3 + "," + max);



    }

}
