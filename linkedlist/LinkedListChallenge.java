package linkedlist;

import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListChallenge {

    private static final Scanner scanner = new Scanner(System.in);
    private LinkedList<Places> listOfPlaces = new LinkedList<>();

    public void linkedlist() {
        System.out.println("""
                Available Actions ( select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
        boolean flag = true;
        while (flag) {

            String action = scanner.nextLine().toUpperCase();

            switch (action) {
                case "F" -> {
                    moveForward();
                }
                case "B" -> {
                    moveBackward();
                }
                case "L" -> {
                    System.out.println("Enter the Name of Town to move: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the distance");
                    int Distance = scanner.nextInt();
                    scanner.nextLine();
                    Places newPlace = new Places(name, Distance);
                    listPlaces(listOfPlaces, newPlace);
                    System.out.println(listOfPlaces);
                    showMenu();
                }
                case "M" -> showMenu();
                case "Q" -> {
                    flag = false;
                    System.out.println("Exiting the program.");
                }
                default -> System.out.println("Invalid Action");
            }
        }
    }

    private void moveForward() {
        System.out.println("Moving forward...");
        // Add forward movement logic here
    }

    private void moveBackward() {
        System.out.println("Moving backward...");
        // Add backward movement logic here
    }

    public void listPlaces(LinkedList<Places> list, Places place) {
        listOfPlaces.addFirst(new Places("Sydney", 0));
        if (list.contains(place)) {
            System.out.println("Found Duplicted: " + place);
            return;
        }
        for (Places places : list) {
            if (places.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found Duplicted: " + place);
                return;

            }
        }
        int matchIndex = 0;
        for (var listPlaces : list) {
            if (place.Distance() < listPlaces.Distance())

            {
                list.add(matchIndex, place);
                return;

            }
            matchIndex++;

        }
        list.add(place);

    }

    private void showMenu() {
        System.out.println("""
                Available Actions ( select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

}
