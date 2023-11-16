package org.example.beginner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class BC1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        String sellerName = scanner.nextLine();
        double fixedSalary = Double.parseDouble(scanner.nextLine());
        double totalSales = Double.parseDouble(scanner.nextLine());

        BigDecimal commission = BigDecimal.valueOf(0.15 * totalSales);
        BigDecimal totalSalary = BigDecimal.valueOf(fixedSalary).add(commission);

        totalSalary = totalSalary.setScale(2, RoundingMode.HALF_EVEN);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);

        scanner.close();
    }
}