package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class NtoPowerOFP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 3 numbers;");
        int a = sc.nextInt();
        int b = sc.nextInt();

         int power = (a^b);
        System.out.println(power);
    }

}
