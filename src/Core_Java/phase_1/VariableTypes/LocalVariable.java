package Core_Java.phase_1.VariableTypes;

public class LocalVariable {
    public static void  main (String[] args){
        int a ;
        // the scope of variable is depend on the place where the variable is declared .
        {
            a =10;
            //ones variable is  initialized with it value it will avaliable throught out class
            System.out.println(a);
        }
        System.out.println(a);

        a = 30;
        // local variable can be reinitialize again. where global can't.
        System.out.println(a);

    }
}
