package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class InScannerEX2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month NO :");
        int month_no = sc.nextInt();
         switch (month_no)
         {
             case 1 -> System.out.println("Jan");
             case 2 -> System.out.println("Feb");
             case 3 -> System.out.println("March");
             case 4 -> System.out.println("April");
             case 5 -> System.out.println("May");
             case 6 -> System.out.println("Jun");
             case 7 -> System.out.println("July");
             case 8-> System.out.println("Aug");
             case 9 -> System.out.println("Sep");
             case 10 -> System.out.println("Oct");
             case 11 -> System.out.println("Nov");
             case 12 -> System.out.println("Dec");

         }
    }
}

