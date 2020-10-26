package dk.cphbusiness.tla.control;

import dk.cphbusiness.tla.viewapi.ShoppingManager;

public class ShoppingManagerFake implements ShoppingManager {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+"! from fake";
        }
    }
