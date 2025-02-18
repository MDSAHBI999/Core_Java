package Core_Java.phase_1.Programing_Lectures_Codes;

public class IN_BigNo_by_condition_oprerator {
    public static void main(String[] args) {


        // By using condition operator
        System.out.println("By using condition operator\n ");
        System.out.println("big one amounts  Two Number " );
        int a = 12;
        int b = 23;

        int big1 = (a>b)? a: b;
        System.out.println(big1);


        System.out.println("\nbig one amounts   Three  Number without using logical operator  " );

        int c = 43;
        int d = 533;
        int e = 87;

        int big2 = (c>d)?c:d;
        big2 = (big2>e )? big2 : e ;
        System.out.println(big2);
        System.out.println("\nbig one amounts   Three  Number with using logical operator and nested condition operator.  " );
        int big3 = (c>d && c>e)? c:(d>c)?b:e;
        System.out.println(big3);





        System.out.println("\nbig one amounts   Three  Number with  using  logical operator and conditional operator  " );

        int f = 53;
        int g = 534;
        int h = 424;

        int big4 = 5;

    }
}
