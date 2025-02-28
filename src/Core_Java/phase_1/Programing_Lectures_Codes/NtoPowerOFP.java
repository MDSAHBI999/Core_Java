package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class NtoPowerOFP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any numbers;");
        int a = sc.nextInt();
        int power =1;
        int b = sc.nextInt();
        while (b>0){
            power = power*a;
            b--;
        }
        System.out.println(power);
    }

}
