package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int  a = sc.nextInt();
        int rem = 0;
        int rev = 0;

        // 123

        for (int i =  a; i>0;i/=10){
            rem = a %10;
            rev = (rev*10)+rem;
            a/=10;

        }
        System.out.println(rev);
    }
}
