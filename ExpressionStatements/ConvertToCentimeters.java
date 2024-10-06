package ExpressionStatements;

public class ConvertToCentimeters {

    public static double convertToCentimeters(int inches) {
        return (double) inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeets, int heightInInches) {
        int feetToInches = heightInFeets * 12;
        int totalInches = feetToInches + heightInInches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
