
public class TraditionalSwitchChallenege {
    public static void switchStatement(char nato) {

        switch (nato) {
            case 'A':
                System.out.println("Able" + nato);
                break;

            case 'B':
                System.out.println("Baker" + nato);
                break;
            case 'C':
                System.out.println("Charlie" + nato);
                break;
            case 'D':
                System.out.println("Dog" + nato);
                break;
            case 'E':
                System.out.println("Easy" + nato);
                break;
            // ... other cases

            default:
                System.out.println("not found" + nato);
                break;

        }
    }

}
