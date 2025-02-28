package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

//print3NoAscendingOrder
public class print3NoAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 3 numbers;");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int big =  (a>b)?a:b;
        big = (a>c)?a:c;

        int small =  (a<b)?a:b;
        small = (small<c)?small:c;

        int mid = (a+b+c) - (big+small);
        System.out.println(small +" "+mid+" "+ big);

    }
}
// find n^p  or N**P