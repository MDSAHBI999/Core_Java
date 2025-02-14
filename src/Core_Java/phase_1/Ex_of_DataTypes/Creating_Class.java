/*
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
*/



import java.io.*;

class TestClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int memory1 = Integer.parseInt(br.readLine().trim());
        int memory2 = Integer.parseInt(br.readLine().trim());

        int[] out = solution(memory1, memory2);
        System.out.print(out[0]);
        for (int i = 1; i < out.length; i++) {
            System.out.print(" " + out[i]);
        }

        wr.close();
        br.close();
    }

    static int[] solution(int memory1, int memory2) {
        int second = 0;
        int consumption = 1;

        while (true) {
            second++;
            // Determine which RAM to consume from
            if (memory1 >= memory2 && memory1 >= consumption) {
                memory1 -= consumption;
            } else if (memory2 > memory1 && memory2 >= consumption) {
                memory2 -= consumption;
            } else {
                // If neither RAM can satisfy the consumption, the computer crashes
                break;
            }
            consumption++;
        }

        return new int[]{second, memory1, memory2};
    }
}




