package org.example.basicExercises;

import java.util.Scanner;

public class Salary_with_Bonus_BEE_1009 {
    public static void main(String[]args) throws Exception {
        Scanner read = new Scanner(System.in);

        String sellerName = read.nextLine();
        double fixedSalary = read.nextDouble();
        double salesTotal = read.nextDouble();

        double total = ((salesTotal * 15)/100) + fixedSalary;
        System.out.printf("TOTAL = %.2f\n", total);
    }
}
