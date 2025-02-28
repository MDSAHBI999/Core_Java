package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class FactorialOfEachDigitofNumber {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers below :");
        int num = sc.nextInt();
        int factorial =1;
        int rem ;
        int sum = 0;
        for (;num>0;num/=10)
        {
            rem = num % 10;
            for (int i =rem; i<=0; i--){
                factorial = factorial * i;
                System.out.println(factorial);
            }
            System.out.println(factorial);
        }}*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int rem;
        int fact ;
        for (int  i =num; num>0;num/=10){
            rem = num%10;
            for (int j = rem; j>0;j--){
                fact = rem*i;
                System.out.println(fact);
            }
        }

    }
}