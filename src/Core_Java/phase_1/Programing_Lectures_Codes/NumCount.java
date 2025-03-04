package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class NumCount {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = sc.nextInt();
        int count= 0;
        for(int i = a;i>=0;i/=10){
            int rem = i%10;
            if (rem%2==0){
                count++;
            }
        }


    }
}
// to find_emirp_Number .