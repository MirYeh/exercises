package exercises.locations.solutions;

import exercises.locations.solutions.switchcase.LocationsImpl;
import exercises.locations.Locations;

import java.util.Scanner;


public class Main {
  private static Locations[] locations = new Locations[]{
      new exercises.locations.solutions.ifelse.LocationsImpl(),
      new LocationsImpl(),
      new exercises.locations.solutions.mapper.LocationsImpl()
  };

  public static void main(String[] args) {
    for (Locations location : locations) {
      testGetItemLocation(location);
      // getLocationFromInput(location);
    }
  }

  public static void getLocationFromInput(Locations location) {
    Scanner input = new Scanner(System.in);
    System.out.print("What are you looking for? ");
    String userInput = input.nextLine();

    String itemLocation = location.getItemLocation(userInput);
    System.out.printf("You should go to the %s\n", itemLocation);
  }


  // What happens when we want to add an item?
  public static void testGetItemLocation(Locations location) {
    System.out.printf(">> Testing location object: %s\n", location.getClass());
    assert location.getItemLocation("books").equals("Library");
    assert location.getItemLocation("movies").equals("Cinema");
    assert location.getItemLocation("electronics").equals("Store");
    assert location.getItemLocation("Nothing") == null;  // What happens if we get an item we don't support?
    assert location.getItemLocation(null) == null;  // what happens if we get `null` instead of a String?

    try {
      assert location.getItemLocation("electronics").equals("FALSE");
      System.err.println("\"electronics\".equals(\"FALSE\") was expected to fail");
      System.exit(1);
    } catch (AssertionError ignored) {}

    System.out.println(">> Tests ran successfully\n");
  }

}

