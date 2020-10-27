package dk.cphbusiness.tla.control;

import dk.cphbusiness.tla.dataapi.ShoppingStore;
import dk.cphbusiness.tla.viewapi.ShoppingListSummary;
import dk.cphbusiness.tla.viewapi.ShoppingManager;
import static dk.cphbusiness.tla.control.Builder.*;


import java.util.List;

public class ShoppingManagerFacade implements ShoppingManager {
    private final ShoppingStore store;

    public ShoppingManagerFacade(ShoppingStore store) {
        this.store = store;
        }

    @Override
    public String sayHello(String name) {
        return "Hello " + name + " from façade and "+store.sayHello(name);
        }

    @Override
    public List<ShoppingListSummary> allLists() {
        return shoppingListSummariesOf(store.allShoppingLists());
        }

    }
