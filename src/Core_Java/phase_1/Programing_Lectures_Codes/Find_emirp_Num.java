package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;
import java.util.SortedMap;

public record Find_emirp_Num() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();


        int rem =0;
        int rev = 0;
        if (num % 1 == 0 && num % num == 0 && num % 2 != 0){

            for (int i = num; i >= 0; i/=10  ){
                rem = i % 10 ;
                rev = rev * 10 + rem ;
            }
            if (rev % 1 == 0 && rev % rev == 0 && rev % 2 != 0){
                System.out.println("Number is Emirp Number .");
            }
        }
        else {
            System.out.println("Number is not Prime Number .");
        }

    }
}
