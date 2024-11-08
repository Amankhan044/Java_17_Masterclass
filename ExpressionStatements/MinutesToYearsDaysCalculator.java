package ExpressionStatements;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.printf("%d min = %d y and %d d%n", minutes, years, remainingDays);

    }
}
