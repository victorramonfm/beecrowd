package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BC1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        String seller = scanner.nextLine();
        float fixedSalary = scanner.nextFloat();
        float totalSales = scanner.nextFloat();
        float commission = 0.15f;

        float finalSalary = fixedSalary + totalSales * commission;

        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);

        scanner.close();
    }

}
