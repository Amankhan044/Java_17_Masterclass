package ExpressionStatements;

public class PositiveNegativeZero {
    // write code here
    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));
    }
}