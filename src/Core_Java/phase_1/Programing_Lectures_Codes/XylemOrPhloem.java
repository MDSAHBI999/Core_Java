package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;

public class XylemOrPhloem
{

    public  static  int Firstnum(int num)
    {

        while( num>=10)
        { num/=10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :" +
                "to  number Xylem Or Phloem");
        int num = sc.nextInt();

        int num1 = num;
        int FirstLast = 0;

        int lastDigit = num % 10;
        int FirstDigit = num;
        while (FirstDigit >= 10) {
            FirstDigit /= 10;
        }
        System.out.println(FirstDigit + " First Digit . ");
        System.out.println(lastDigit + " Last Digit .");
        FirstLast = FirstDigit + lastDigit;

        int middelNum = 0;

        int result = Firstnum(num);
        while (num1 > 10) {

            num1/=10;
            int rem = num1%10;

        if (num % 10 != lastDigit && result!= FirstDigit){
            System.out.println("number is Xylem");

        }
        else
            System.out.println("number is Phloem ");
        }
    }
}

// find the happy number .
// find tech number
// .