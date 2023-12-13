package org.example.beginner;

import java.util.Scanner;

public class BEE1019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int hours, minutes, seconds;

        hours = n / 3600;
        minutes = (n % 3600) / 60;
        seconds = ((n % 3600) % 60);

        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

    }

}
