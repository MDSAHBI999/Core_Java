package Core_Java.phase_1.Variable;

public class LocalVariables {
    public static void main(String [] args ){

        int a;
        System.out.println("\n \n Here a ia only declared and not initialized so we can't use it :");
        {
            int b =30;
            a = 20;
            System.out.println(a+"\n");
            System.out.println("we can't access the variable b out side of then current file it will through CTE"+b);
            //we can't access  b outside  of  this block this we  through compile time error .
        }
        System.out.println("here place of declaration is  decides the scope of variable .");
        System.out.println(a+"\n");
        System.out.println("LOCAL variable are executed  at compile  time and \n this are stored inside  STACK AREA of JVM  ");
    }
}
