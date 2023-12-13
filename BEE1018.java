package org.example.beginner;

import java.util.Scanner;

public class BEE1018 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        if (amount < 0 || amount > 1000000) {
            throw new Exception();
        }

        System.out.println(amount);

        for (int note : notes) {
            System.out.printf("%d nota(s) de R$ %d,00%n", amount / note, note);

            amount %= note;
        }

    }
}
