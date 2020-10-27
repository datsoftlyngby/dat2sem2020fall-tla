package dk.cphbusiness.tla.viewapi;

public class ShoppingListIdentifier {
  public static int none = 0;
  private final int id;

  public ShoppingListIdentifier(int id) {
    this.id = id;
    }

  public int getId() { return id; }
  }
