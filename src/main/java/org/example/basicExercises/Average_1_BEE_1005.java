package org.example.basicExercises;

import java.io.IOException;
import java.util.Scanner;

public class Average_1_BEE_1005 {

        public static void main(String[] args) throws IOException {
            Scanner ler = new Scanner(System.in);

            double A = ler.nextDouble();
            double B = ler.nextDouble();

            double MEDIA = ((3.5*A) + (7.5*B))/11;
            System.out.println(String.format("MEDIA = %.5f", MEDIA));
        }

    }

