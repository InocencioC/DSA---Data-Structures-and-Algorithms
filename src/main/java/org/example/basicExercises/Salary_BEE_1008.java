package org.example.basicExercises;
import java.util.Scanner;
import java.io.IOException;

public class Salary_BEE_1008 {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        int numberWorker = read.nextInt();
        double amountHour = read.nextDouble();
        int hour = read.nextInt();

        double salary = hour * amountHour;
        System.out.println("NUMBER = " + numberWorker);
        System.out.printf("SALARY = U$ %.2f%n", salary);

}
}
