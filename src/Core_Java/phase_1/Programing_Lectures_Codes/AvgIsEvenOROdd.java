package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

//write a prog to find the average of a digit of a number and check avr is even or odd.
public class AvgIsEvenOROdd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the numbers below :");
        // 343
        int num = sc.nextInt();
        int count =0;
        int i =0 ;
        int rem ;
        int sum = 0;
         for (;num>0;num/=10){
             rem = num % 10;
              sum = sum + rem  ;

              count++;
         }
         int  avg = (sum / count);
        System.out.println("The avrage of  a digit of a number is "+avg);
        if (avg%2==0)
            System.out.println("The avrage of  a digit of a number "+avg+"  Even.");
        else
            System.out.println("The avrage of  a digit of a number "+avg+"  Odd.");
    }
}
