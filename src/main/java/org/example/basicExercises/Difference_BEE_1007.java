package org.example.basicExercises;
import java.io.IOException;
import java.util.Scanner;

public class Difference_BEE_1007 {
    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        int numberWorker = read.nextInt();
        int amountHour = read.nextInt();
        int hour = read.nextInt();

        double salary = hour * amountHour;
        System.out.println("NUMBER = " + numberWorker);
        System.out.println(String.format("SALARY = U$ %.2f" ,salary));
}


}
