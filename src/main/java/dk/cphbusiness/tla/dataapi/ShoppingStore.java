package dk.cphbusiness.tla.dataapi;

import java.util.Collection;

public interface ShoppingStore {
    /**
     * Method to check configuration and basic connections
     * @param name a name to greet
     * @return the greeting
     */
    String sayHello(String name);

    // Examples of persistence methods
    Collection<ShoppingList> allShoppingLists();
    Collection<ShoppingList> allShoppingLists(ShoppingListCriteria criteria);
    }
