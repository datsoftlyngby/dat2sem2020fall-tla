package dk.cphbusiness.tla.data.mapped;

import dk.cphbusiness.tla.dataapi.ShoppingList;
import dk.cphbusiness.tla.dataapi.ShoppingListCriteria;
import dk.cphbusiness.tla.dataapi.ShoppingStore;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static dk.cphbusiness.tla.utilities.DevelopmentTools.TODO;

/**
 * Shopping Store for Mocking.
 * Should be defined in the test part of the project
 */
public class MappedShoppingStore implements ShoppingStore {
    private final Map<Integer, ShoppingList> shoppingLists = new HashMap<>();

    public MappedShoppingStore() {
        shoppingLists.put(7, new ShoppingList(7, "Kurts liste", "meget kort liste"));
        shoppingLists.put(9, new ShoppingList(9, "Sonjas liste", "en meget lang liste"));
        shoppingLists.put(13, new ShoppingList(13, "Fælleslisten", "næsten den samme som Sonjas"));
        }

    @Override
    public String sayHello(String name) {
        return "Hello "+name+" from mapped store";
        }

    @Override
    public Collection<ShoppingList> allShoppingLists() {
        return shoppingLists.values();
        }

    @Override
    public Collection<ShoppingList> allShoppingLists(ShoppingListCriteria criteria) {
        throw TODO("Define criteria, consider using Predicate lambda");
        }

    }
