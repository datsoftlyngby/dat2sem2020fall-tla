package dk.cphbusiness.tla.viewapi;

public class ShoppingListSummary extends ShoppingListIdentifier {
  private final String name;
  private final String description;

  public ShoppingListSummary(int id, String name, String description) {
    super(id);
    this.name = name;
    this.description = description;
    }

  public String getName() { return name; }

  public String getDescription() { return description; }

  }
