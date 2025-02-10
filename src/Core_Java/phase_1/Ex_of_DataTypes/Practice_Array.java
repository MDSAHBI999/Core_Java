package Core_Java.phase_1.Ex_of_DataTypes;

import java.util.Arrays;

public class Practice_Array {
    public static void main(String[] args) {
        String country = "India";
        int population = 121221211;
        int area = 51232;
        byte states = 29;
        byte unionTerritories = 7;
        String[] languages = {"Hindi", "Marathi", "English"};

        System.out.println(population);
        System.out.println(country);
        System.out.println(area);
        System.out.println(states);
        System.out.println(unionTerritories);
        System.out.println(Arrays.toString(languages));  // Proper array printing
    }
}
