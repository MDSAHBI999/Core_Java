package Core_Java.phase_1.Programing_Lectures_Codes;

import java.util.Scanner;
public class InScannerEx1{
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the below details :" );

        System.out.println("enter the name:");
        String name = sc.next();

        System.out.println("enter the phone number :");
        long  Phone_no  = sc.nextLong();

        System.out.println("enter the weight  :");
        float weight    = sc.nextFloat();

        System.out.println("enter the Height  :");
        float height = sc.nextFloat();

        System.out.println("enter the Email_Id  :");
        String Email_id = sc.next();


        System.out.println(name +"\n"+ Phone_no +"\n"+ weight+"\n"+height+"\n"+Email_id );

    }
}
