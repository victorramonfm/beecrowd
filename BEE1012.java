import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextFloat();
        double B = scanner.nextFloat();
        double C = scanner.nextFloat();

        double PI = 3.14159;

        double triangleArea = (A * C) / 2.0;
        double circleArea = PI * Math.pow(C, 2);
        double trapezionArea = (A + B) * C / 2.0;
        double squareArea = Math.pow(B, 2);
        double rectangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapezionArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);

        scanner.close();

    }

}
