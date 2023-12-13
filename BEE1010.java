import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int codeProduct1 = scanner.nextInt();
        int amountProduct1 = scanner.nextInt();
        double priceProduct1 = scanner.nextDouble();

        int codeProduct2 = scanner.nextInt();
        int amountProduct2 = scanner.nextInt();
        double priceProduct2 = scanner.nextDouble();

        double amountToPay = (amountProduct1 * priceProduct1) + (amountProduct2 * priceProduct2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", amountToPay);

        scanner.close();
    }

}

