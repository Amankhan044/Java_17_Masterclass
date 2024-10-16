
import ControlFlow.*;
import OopInheritance.*;
import OopInheritance.InheritanceChallenge.*;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        HourlyEmployee tim = new HourlyEmployee("Tim", "11/11/1995", 0, "11/11/2024", 15);
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
    }
}
