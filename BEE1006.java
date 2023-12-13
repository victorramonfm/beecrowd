import java.util.Locale;
import java.util.Scanner;

public class BEE1006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        float weightA = 2.0f;
        float weightB = 3.0f;
        float weightC = 5.0f;

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double mean = ((weightA * a) + (weightB * b) + (weightC * c)) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f\n", mean);

        scanner.close();
    }

}
