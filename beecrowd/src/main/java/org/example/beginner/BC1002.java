package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BC1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();

        double PI = 3.14159;

        double A = PI * Math.pow(R, 2);

        System.out.printf("A=%.4f\n", A);

        scanner.close();

    }

}
