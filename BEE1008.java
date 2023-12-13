package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BEE1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        float amountReceivedPerHour = scanner.nextFloat();

        float salary = amountReceivedPerHour * hoursWorked;

        System.out.printf("NUMBER = %d\n", employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scanner.close();
    }

}
