package org.example.beginner;

import java.util.Scanner;

public class BC1001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.printf("X = %d\n", X);

        scanner.close();

    }

}
