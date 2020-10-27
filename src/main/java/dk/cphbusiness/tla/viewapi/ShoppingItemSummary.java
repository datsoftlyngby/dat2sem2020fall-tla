package dk.cphbusiness.tla.viewapi;

public class ShoppingItemSummary extends ShoppingItemIdentifier {
  private final String text;

  public ShoppingItemSummary(int id, String text) {
    super(id);
    this.text = text;
    }

  public String getText() { return text; }

  }
