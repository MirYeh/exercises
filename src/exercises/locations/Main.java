package exercises.locations;

import exercises.locations.LocationsImpl;

import java.util.Scanner;


public class Main {
  private static Locations locations = new LocationsImpl();

  public static void main(String[] args) {
    getLocationFromInput();
    testGetItemLocation();
  }

  public static void getLocationFromInput() {
    Scanner input = new Scanner(System.in);
    System.out.print("What are you looking for? ");
    String userInput = input.nextLine();

    String itemLocation = locations.getItemLocation(userInput);
    System.out.printf("You should go to the %s\n", itemLocation);
  }

  public static void testGetItemLocation() {
    // Run tests here
    // Make sure you can get all items, check edge cases (What happens if we get an item we don't support? What happens if we get a `null` value?)
  }

}
