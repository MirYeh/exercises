package exercises.locations;

public interface Locations {
  /**
   * Gets the location of the item of `null` if we don't know the location
   * @param item String item
   * @return String or null
   */
  String getItemLocation(String item);
}
