package ExpressionStatements;

public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int Megabytes = kiloBytes / 1024;
            int kilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + Megabytes + " MB and " + kilobytes + " KB");
        }
    }
}