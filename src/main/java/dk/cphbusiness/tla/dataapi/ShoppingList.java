package dk.cphbusiness.tla.dataapi;

/**
 * Entity class reflects what should be persisted
 */
public class ShoppingList {
    private final int id;
    private String name;
    private String description;
    // something to hold items lazily

    public ShoppingList(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        }

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String value) { name = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { description = value; }

    }

