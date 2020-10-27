package dk.cphbusiness.tla.viewapi;

import java.util.List;

public class ShoppingListDetail extends ShoppingListIdentifier {
  private String name;
  private String description;
  private final List<ShoppingItemSummary> items;

  public ShoppingListDetail(int id, String name, String description, List<ShoppingItemSummary> items) {
    super(id);
    this.name = name;
    this.description = description;
    this.items = items;
    }

  public ShoppingListDetail(String name, String description, List<ShoppingItemSummary> items) {
    this(none, name, description, items);
    }

  public String getName() { return name; }
  public void setName(String value) { name = value; }

  public String getDescription() { return description; }
  public void setDescription(String value) { description = value; }

  public List<ShoppingItemSummary> getItems() { return items; }

  }
