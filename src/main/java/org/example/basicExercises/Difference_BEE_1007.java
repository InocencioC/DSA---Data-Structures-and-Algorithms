package org.example.basicExercises;
import java.io.IOException;
import java.util.Scanner;

public class Difference_BEE_1007 {
    public static void main(String[] args) throws IOException {

    Scanner read = new Scanner(System.in);
    int A = read.nextInt();
    int B = read.nextInt();
    int C = read.nextInt();
    int D = read.nextInt();

    int DIFERENCA = A * B - C * D;
        System.out.println("DIFERENCA = " + DIFERENCA);
}


}
