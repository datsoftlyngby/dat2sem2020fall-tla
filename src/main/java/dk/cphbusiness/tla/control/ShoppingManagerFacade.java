package dk.cphbusiness.tla.control;

import dk.cphbusiness.tla.viewapi.ShoppingManager;

public class ShoppingManagerFacade implements ShoppingManager {

    @Override
    public String sayHello(String name) {
        return "Hello "+name+"! from production";
        }

    }
