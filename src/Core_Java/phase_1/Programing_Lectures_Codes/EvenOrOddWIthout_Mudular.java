package Core_Java.phase_1.Programing_Lectures_Codes;
// find even and  odd number without using modulus oprator

import java.util.Scanner;

public class EvenOrOddWIthout_Mudular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if (((num/2)*2)==num){
            System.out.println("the number is even ");
        }
        else
            System.out.println("the number is Odd ");
    }

}

