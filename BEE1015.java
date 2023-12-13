package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double x1, x2, y1, y2, d;

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", d);

    }
}
