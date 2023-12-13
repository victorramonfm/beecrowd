package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1005 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float weightA = 3.5f;
        float weightB = 7.5f;

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double mean = ((weightA * a) + (weightB * b)) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f\n", mean);

        scanner.close();
    }

}
