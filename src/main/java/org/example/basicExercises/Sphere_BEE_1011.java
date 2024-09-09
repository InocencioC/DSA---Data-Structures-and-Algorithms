package org.example.basicExercises;
import java.io.IOException;
import java.util.Scanner;

public class Sphere_BEE_1011 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // Read the input radius as a double
        double radius = scanner.nextDouble();

        // Define the value of Pi
        double pi = 3.14159;

        // Calculate the volume using the formula (4/3.0) * pi * R^3
        double volume = (4.0 / 3) * pi * Math.pow(radius, 3);

        // Print the result with 3 decimal places
        System.out.printf("VOLUME = %.3f%n", volume);

        // Close the scanner
        scanner.close();

    }
}
