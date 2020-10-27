package dk.cphbusiness.tla.viewapi;

import java.util.List;

public interface ShoppingManager {
    String sayHello(String name);
    List<ShoppingListSummary> allLists();
    }
