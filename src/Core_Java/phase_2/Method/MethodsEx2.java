package Core_Java.phase_2.Method;
//Create a Method AddNumbers that takes two integers and returns their sum. Call it with different values.


import java.util.Scanner;

public class MethodsEx2 {
    static class addition {
        static  int add(int a, int b) {
            return a + b;
        }
        static  int add(int a, int b,int c) {
            return a + b + c;
        }
        static  int add(int a) {
            return a ;
        }


        public static void main(String[] args) {

            Scanner obj =  new Scanner(System.in);
            System.out.println("Enter the integer number for Addition :");
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();


             int add1 = addition.add(a);
             int add2 = addition.add(a,b);
             int add3 = addition.add(a,b,c);

            System.out.println(add1);
            System.out.println(add2);
            System.out.println(add3);

        }
    }
}