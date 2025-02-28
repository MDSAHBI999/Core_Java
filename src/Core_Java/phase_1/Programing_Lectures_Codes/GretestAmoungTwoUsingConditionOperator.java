package Core_Java.phase_1.Programing_Lectures_Codes;
// WAJP TO find greatest of 3 by using conditional operator.

import java.util.Scanner;

public class GretestAmoungTwoUsingConditionOperator {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first numbers below :");
        int a = sc.nextInt();

        System.out.println("Enter the second numbers below :");
        int b = sc.nextInt();

        System.out.println("Enter the third numbers below :");
        int c = sc.nextInt();

        int big2 = (a>b)?a:b;
        big2 = (big2 >c)? big2 : c ;
        System.out.println("the biggest number is "+big2);


    }


}
