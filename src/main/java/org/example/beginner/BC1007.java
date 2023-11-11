package org.example.beginner;

import java.util.Locale;
import java.util.Scanner;

public class BC1007 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int difference = a * b - c * d;

        System.out.printf("DIFERENCA = %d\n", difference);

    }

}
