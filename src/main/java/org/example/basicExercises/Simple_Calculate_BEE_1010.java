package org.example.basicExercises;

import java.io.IOException;
import java.util.Scanner;

public class Simple_Calculate_BEE_1010 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int pro1 = scan.nextInt();
        int unit1 = scan.nextInt();
        double price1 = scan.nextDouble();
        int pro2 = scan.nextInt();
        int unit2 = scan.nextInt();
        double price2 = scan.nextDouble();

        double total = (unit1 * price1) + (unit2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
