package org.example.course;

import java.util.Arrays;
import java.util.Scanner;

public class Vector_2 {

    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "LD";
        estados[1] = "CD";
        estados[2] = "KN";
        estados[3] = "ME";
        estados[4] = "BE";
        estados[5] = "HB";
        estados[6] = "M";
        estados[7] = "CS";
        estados[8] = "CN";
        estados[9] = "HA";

        for (int i = 0; i < estados.length; i++) {
            // System.out.println(estados[i]);
        }
        System.out.println(Arrays.toString(estados));
        System.out.println("Which state do you want to search");
        Scanner leitor = new Scanner(System.in);
        String siglaBusca = leitor.nextLine();

        //busca linear
        boolean founded = false;
        for (int i = 0; i < estados.length; i++) {
            String vectorElement = estados[i];
            if (vectorElement.equals(siglaBusca)) {
                founded = true;
                break;
            }

        }
        if (founded == true){
            System.out.println("Founded");
        }else {
            System.out.println("Not Founded");
        }
    }
}


