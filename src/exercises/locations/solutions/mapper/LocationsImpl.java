package exercises.locations.solutions.mapper;

import exercises.locations.Locations;

import java.util.HashMap;
import java.util.Map;

public class LocationsImpl implements Locations {
  private Map<String, String> mapLocations;

  public LocationsImpl() {
    mapLocations = new HashMap<>();
    mapLocations.put("books", "Library");
    mapLocations.put("movies", "Cinema");
    mapLocations.put("electronics", "Store");
  }

  public String getItemLocation(String item) {
    return mapLocations.get(item.toLowerCase());
  }

}
