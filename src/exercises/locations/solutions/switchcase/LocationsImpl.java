package exercises.locations.solutions.switchcase;

import exercises.locations.Locations;

public class LocationsImpl implements Locations {

  public LocationsImpl() {}

  public String getItemLocation(String item) {
    if (item == null)  return null;

    switch (item.toLowerCase()) {
      case "books":
        return "Library";
      case "movies":
        return "Cinema";
      case "electronics":
        return "Store";
      default:
        return null;
    }
  }

}
