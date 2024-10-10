package ControlFlow;

public class NumberToWords {

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");

        } else if (number == 0) {
            System.out.println("Zero");
        }

        else {
            int reversedNumber = reverse(number);
            while (reversedNumber != 0) {
                int newNumber = reversedNumber % 10;
                reversedNumber = reversedNumber / 10;
                String word = switch (newNumber) {
                    case 0 -> "Zero";
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    default -> "Others";
                };
                System.out.println(word);

            }
            int diff = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 0; i < diff; i++) {
                System.out.println("Zero");

            }

        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;

        }
        int numCount = 0;
        if (number <= 9) {
            numCount++;
        } else {
            while (number != 0) {

                number = number / 10;
                numCount++;

            }

        }
        return numCount;
    }

}
