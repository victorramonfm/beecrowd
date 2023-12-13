package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int totalDistance = scanner.nextInt();
        float totalSpentFuel = scanner.nextFloat();

        float averageConsumption = totalDistance / totalSpentFuel;

        System.out.printf("%.3f km/l\n", averageConsumption);

        scanner.close();

    }

}
