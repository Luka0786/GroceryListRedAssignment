public class GroceryItemOrder
{
    // Variables
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    // Constructor that sets the item name and quantity of 1
    public GroceryItemOrder(String itemName)
    {
        this.itemName = itemName;
        this.quantity = 1;
    }

    // Constructor that sets the item name, quantity and price per unit
    public GroceryItemOrder(String itemName, int quantity, double pricePerUnit)
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Method that returns the total cost of an item in its given quantity
    public double getCost()
    {
        return (this.pricePerUnit * this.quantity);
    }

    // Method that returns the name of the item
    public String getItemName()
    {
        return itemName;
    }

    // Method that returns the quantity amount
    public int getQuantity()
    {
        return quantity;
    }

    // Setter for the item name
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    // Setter for quantity
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Setter for price per unit
    public void setPricePerUnit(double pricePerUnit)
    {
        this.pricePerUnit = pricePerUnit;
    }

    // toString method that prints item name, quantity and total cost
    @Override
    public String toString()
    {
        return "\nItem name: " + this.itemName +
                "\nQuantity: " + this.quantity +
                "\nTotal cost: " + this.getCost() +
                "\n";
    }

}
