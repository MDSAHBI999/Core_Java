package Core_Java.phase_1.Programing_Lectures_Codes;
// user entere char is alphabate digit or specal char .

import java.util.Scanner;

public class CharIs_digitOralph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = 6;

        if (num >= 'a' && num <= 'z'|| num>= 'A'&& num <= 'Z' )
        System.out.println("the  user enter  is  Alphabate ");
        if (num >= 9 && num <= 0 )
        System.out.println("the  user enter  is  a Digit  ");
    }

}
