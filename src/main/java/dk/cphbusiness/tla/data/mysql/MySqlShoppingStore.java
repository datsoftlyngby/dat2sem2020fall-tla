package dk.cphbusiness.tla.data.mysql;

import dk.cphbusiness.tla.dataapi.ShoppingList;
import dk.cphbusiness.tla.dataapi.ShoppingListCriteria;
import dk.cphbusiness.tla.dataapi.ShoppingStore;

import java.util.Collection;

import static dk.cphbusiness.tla.utilities.DevelopmentTools.TODO;

public class MySqlShoppingStore implements ShoppingStore {
    private final String connectionsString;

    public MySqlShoppingStore(String connectionsString) {
        this.connectionsString = connectionsString;
        }

    @Override
    public String sayHello(String name) {
        return "Hello "+name+" from MySql Store";
        }

    @Override
    public Collection<ShoppingList> allShoppingLists() {
        throw TODO();
        }

    @Override
    public Collection<ShoppingList> allShoppingLists(ShoppingListCriteria criteria) {
        throw TODO();
        }

    }
