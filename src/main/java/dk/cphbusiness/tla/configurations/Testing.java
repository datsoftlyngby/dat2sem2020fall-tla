package dk.cphbusiness.tla.configurations;

import dk.cphbusiness.tla.control.ShoppingManagerFake;
import dk.cphbusiness.tla.viewapi.ShoppingManager;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

@Alternative
public class Testing {
    @Produces
    @Shopping
    ShoppingManager getShoppingManager() {
        return new ShoppingManagerFake();
        }
    }
