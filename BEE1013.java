import java.util.Scanner;

public class BEE1013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int biggerAB = (A + B + Math.abs(A - B)) / 2;
        int biggerABC = (biggerAB + C + Math.abs(biggerAB - C)) / 2;

        System.out.printf("%d eh o maior\n", biggerABC);

        scanner.close();

    }

}
