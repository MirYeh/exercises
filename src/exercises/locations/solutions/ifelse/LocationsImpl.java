package exercises.locations.solutions.ifelse;

import exercises.locations.Locations;

public class LocationsImpl implements Locations {

  public LocationsImpl() {}

  public String getItemLocation(String item) {
    if (item == null)  return null;

    item = item.toLowerCase();
    if (item.equals("books")) {
      return "Library";
    } else if (item.equals("movies")) {
      return "Cinema";
    } else if (item.equals("electronics")) {
      return "Store";
    }

    return null;
  }

}
