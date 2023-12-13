package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double performance = 12.0;

        int spentTime = scanner.nextInt();
        int averageSpeed = scanner.nextInt();

        double litersNeeded = averageSpeed * spentTime / performance ;

        System.out.printf("%.3f%n", litersNeeded);

    }
}
