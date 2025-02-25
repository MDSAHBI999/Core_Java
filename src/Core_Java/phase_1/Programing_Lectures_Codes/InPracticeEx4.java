package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class InPracticeEx4 {
    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        while (i <= number){
            System.out.print(i+" ");
            i+=1;
        }
    }
}
