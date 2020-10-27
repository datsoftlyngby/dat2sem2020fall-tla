package dk.cphbusiness.tla.control;

import dk.cphbusiness.tla.viewapi.ShoppingListSummary;
import dk.cphbusiness.tla.viewapi.ShoppingManager;

import java.util.Collections;
import java.util.List;

public class ShoppingManagerFake implements ShoppingManager {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+" from fake!";
        }

    @Override
    public List<ShoppingListSummary> allLists() {
        return Collections.EMPTY_LIST;
        }

    }
