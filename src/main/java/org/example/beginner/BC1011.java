package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BC1011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float radius = scanner.nextFloat();
        double PI = 3.14159;

        double volume = 4.0 / 3.0 * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}
