package dk.cphbusiness.tla.configurations;

import dk.cphbusiness.tla.control.ShoppingManagerFacade;
import dk.cphbusiness.tla.data.mysql.MySqlShoppingStore;
import dk.cphbusiness.tla.viewapi.ShoppingManager;

import javax.enterprise.inject.Produces;

public class Production {
    @Produces
    @Shopping
    ShoppingManager getShoppingManager() {
        return new ShoppingManagerFacade(new MySqlShoppingStore("mysql:shopping..."));
        }
    }
