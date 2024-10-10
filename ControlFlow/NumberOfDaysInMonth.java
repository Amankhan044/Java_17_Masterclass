package ControlFlow;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean maxYear = year >= 1 && year <= 9999;
        if (maxYear) {
            return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (1 <= month && month <= 12 && 1 <= year && year <= 9999) {
            return switch (month) {
                case 1 -> 31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 3 -> 31;
                case 4 -> 30;
                case 5 -> 31;
                case 6 -> 30;
                case 7 -> 31;
                case 8 -> 31;
                case 9 -> 30;
                case 10 -> 31;
                case 11 -> 30;
                case 12 -> 31;
                default -> -1;
            };
        } else {
            return -1;
        }
    }
}
