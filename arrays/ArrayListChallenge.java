package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<>();

    public void arrayList() {
        System.out.println("""
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any item(s) from list (comma delimited list)
                Enter a number for which action you want to do:
                """);

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Current List: " + groceryList);

        switch (option) {
            case 0 -> {
                System.out.println("Shutdown...");
                break;
            }
            case 1 -> {
                System.out.println("Enter items to add (separated by commas):");
                String[] itemsToAdd = scanner.nextLine().split(",");

                for (String item : itemsToAdd) {
                    item = item.trim();
                    if (groceryList.contains(item)) {
                        continue;
                    } else {
                        groceryList.add(item);
                        System.out.println("Added \"" + item + "\" to the list.");
                    }
                }

                System.out.println("Updated Grocery List: " + groceryList);
                System.out.println();
                arrayList();
            }
            case 2 -> {
                System.out.println("Enter items to remove (separated by commas):");
                String[] itemsToRemove = scanner.nextLine().split(",");

                for (String item : itemsToRemove) {
                    item = item.trim();
                    if (groceryList.remove(item)) {
                        System.out.println("Removed \"" + item + "\" from the list.");
                    } else {
                        System.out.println("Item \"" + item + "\" was not found in the list.");
                    }
                }

                System.out.println("Updated Grocery List: " + groceryList);
                arrayList(); // Restart for the next action
            }
            default -> {
                System.out.println("Invalid Option ");
                arrayList();
            }
        }
    }
}
