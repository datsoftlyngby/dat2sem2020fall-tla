package dk.cphbusiness.tla.control;

import dk.cphbusiness.tla.dataapi.ShoppingList;
import dk.cphbusiness.tla.viewapi.ShoppingListSummary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Builder {

    static ShoppingListSummary shoppingListSummaryOf(ShoppingList entity) {
        return new ShoppingListSummary(
                entity.getId(),
                entity.getName(),
                entity.getDescription()
                );
        }

    static List<ShoppingListSummary> shoppingListSummariesOf(Collection<ShoppingList> entities) {
        List<ShoppingListSummary> summaries = new ArrayList<>();
        for (var entity : entities) summaries.add(shoppingListSummaryOf(entity));
        return summaries;
        }

    }
