package org.example.basicExercises;
import java.io.IOException;
import java.util.Scanner;

public class Simple_Product_BEE_1004 {
    public static void main(String[] args) throws IOException {
    Scanner read = new Scanner(System.in);

    int A = read.nextInt();
    int B = read.nextInt();

    int PROD = A*B;
        System.out.println("PROD = " + PROD);

}
}
