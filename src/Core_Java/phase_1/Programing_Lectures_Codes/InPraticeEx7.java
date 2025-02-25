package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

// WAJP to find factorial of Number.
// WAJP to print even numbers form i to n number.
// WAJP pt add odd number from i to n number.
public class InPraticeEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        while (i<=number) {
            if (number % 2 == 0)
                System.out.print(number + " number is even");

            i++;
        }
    }
    }

