package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

//wajp to write the sum of n natural number.
public class InpracticeEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the sum of number :");
        int number = sc.nextInt();
        int i =0;
        int sum = 0;
        while (i <= number)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

    }
}
