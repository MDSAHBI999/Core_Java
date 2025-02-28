package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        int temp = num;
        int armstrong = 0;

        while (num>0){
            int rem = num%10;
            armstrong = armstrong + rem*rem*rem;
            num/=10;
        }

        if (temp==armstrong)
            System.out.println(temp+" is Armstrong number .");
        else
            System.out.println(temp+" is Not  Armstrong number .");
    }
}
