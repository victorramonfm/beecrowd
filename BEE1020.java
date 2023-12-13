import java.util.Scanner;

public class BEE1020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ageInDays, years, months, days;
        int YEAR_IN_DAYS = 365;
        int MONTH_IN_DAYS = 30;

        ageInDays = scanner.nextInt();

        years = ageInDays / YEAR_IN_DAYS;
        months = (ageInDays % YEAR_IN_DAYS) / MONTH_IN_DAYS;
        days = (ageInDays % YEAR_IN_DAYS) % MONTH_IN_DAYS;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

    }

}
