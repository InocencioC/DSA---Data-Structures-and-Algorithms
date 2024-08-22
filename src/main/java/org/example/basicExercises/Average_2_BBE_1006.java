package org.example.basicExercises;
import java.io.IOException;
import java.util.Scanner;
public class Average_2_BBE_1006 {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        double MEDIA = (((A * 2) + (B * 3) + (C * 5)) / 10);
        System.out.printf("MEDIA = %.1f%n", MEDIA);
}
}
