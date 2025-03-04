package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;
import java.util.SortedMap;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();

        int rem = num ;
        int sum = 0 ;
        int mult = 1 ;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            mult *= digit;
            num /= 10;
        }
        if (mult==sum)
            System.out.println(rem+ " is Spy Number.");
        else
            System.out.println(rem+ " is Not Spy Number.");
    }
}
/*
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
    }

    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }
}
 */