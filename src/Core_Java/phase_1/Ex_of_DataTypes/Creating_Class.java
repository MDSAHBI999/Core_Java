package Core_Java.phase_1.Ex_of_DataTypes;

public class Creating_Class {


    public static String greet(String name) {
        return "Hey it's , " + name + "Here";
    }

    float mult(int a ,int b){
        return a * b ;
    }

    float add(int a ,int b){
        return a + b ;
    }
    public static void main(String[] args){

        String greeting = greet(" Mohammed sahbi ");
        System.out.println(greeting);

        // Creating object for mult (multiplication)  in class Creating_Class .
        Creating_Class obj1 = new Creating_Class();
        // printing the multiplication without any third variable or datatype .
        System.out.println("multipication is " + obj1.mult(11 ,3) );

        // Creating object for add (addition)  in class Creating_Class .
        Creating_Class obj2 = new Creating_Class();
        // Storing output in third variable .
        float result = obj2.add(1021, 212);
        // printing result of addition .
        System.out.println(" addition is "+ result);
    }
}
