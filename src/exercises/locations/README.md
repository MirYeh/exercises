# Locations
Return a location to the user depending on the item type they are looking for.

If a user is looking for books, return `Library`,<br>
If a user is looking for movies, return `Cinema`,<br>
If a user is looking for electronics, return `Store`, etc.



## Steps

1. Create functionality:
    * Create a `LocationsImpl.java` class that implements the `Locations.java` interface 
    * Call the implementation in `Main.java`
2. Implement a test method in `Main.java`: 
    * Handle cases for items we don't support or `null` values in `Locations::getItemLocation`
    * Add support for another item type (for medicines return Pharmacy)
    * Adjust the implementation if needed to support different casing ("books", "Books" and "BOOKS" should all return "Library")