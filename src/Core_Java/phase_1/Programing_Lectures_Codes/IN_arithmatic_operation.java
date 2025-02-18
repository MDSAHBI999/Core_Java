package Core_Java.phase_1.Programing_Lectures_Codes;

public class IN_arithmatic_operation {
    public static void main(String[] args) {
        int a = 5 ;
        if (a%2 == 0){
            System.out.println("The No.  is "+a+" Even");
        }
        else {
            System.out.println("The No.  is "+a+" odd");
        }
        System.out.println("\n");


        System.out.println("\n Finding number is even  or  odd With using Ternary operator in Java");
        int b = 10 ;
        String str1 = (b%2==0)?"Number is Even":"number is Odd";
        System.out.println(str1);



        System.out.println("\n Finding number is even  or  odd With using Switch Case");


        int c = 21;
        switch (c%2)
        {
            case 0:
            {
                System.out.println("The Number is Even");
            }break;
            case 1:
            {
                System.out.println("The Number is Odd ");
            }break;

        }



        // WAJP to find the number is even or odd  without using % modules  operator ;
        System.out.println("\n Finding number is even  or  odd Without using  % (modules)");
        int d = 21;
        if((d/2)*2 == d)
        {
            System.out.println("the number is  Even");
        }
        else {
            System.out.println("the number is  Odd");
        }

    }

}
