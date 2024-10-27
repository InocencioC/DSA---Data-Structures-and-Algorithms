package org.example.course;

import java.util.Arrays;

public class Vector_1 {
    public static void main (String[] args) {

        int [] vector = new int[10];
        vector[0] = 14;
        vector[1] = 21;
        vector[2] = 23;
        vector[3] =74;
        vector[4] = 65;
        vector[5] = 46;
        vector[6] = 17;

        System.out.println("Printing");
        for (int i=0; i<vector.length;i++) {
            System.out.println(vector[i]);
        }
        // Imprimir os elementos do vetor
       // System.out.println(Arrays.toString(vector));
    }
}
