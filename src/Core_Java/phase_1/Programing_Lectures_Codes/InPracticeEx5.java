package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;
// wap to print number form n to 1

public class InPracticeEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be print:");
        int number = sc.nextInt();

        while (number >=1){
            System.out.print(number+" ");
            number--;
        }
    }
}