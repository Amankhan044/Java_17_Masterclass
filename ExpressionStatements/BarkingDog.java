package ExpressionStatements;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (0 <= hourOfDay && hourOfDay < 24) {
            if ((hourOfDay < 8 || hourOfDay > 22) && barking == true) {
                return true;
            }
            return false;
        }
        return false;
    }
}