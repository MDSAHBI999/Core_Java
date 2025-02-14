package Core_Java.phase_1.VariableTypes;


public class GlobalVariable {

    int GlobalVar = 365 ;
    // the scope of global variable is through out  the class
    public static void main(String[] args ){
        System.out.println("\n");
        GlobalVariable G_var_obj = new GlobalVariable();

        // Print the value of the GlobalVar variable
        System.out.println(G_var_obj.GlobalVar);
        System.out.println("\n");

    }
}
