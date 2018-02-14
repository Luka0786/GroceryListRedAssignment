import java.util.Arrays;

public class GroceryList
{
    // Variables
    private GroceryItemOrder[] groceryItemOrders;
    private int pointer;

    // Constructor to grocerylist
    public GroceryList()
    {
        groceryItemOrders = new GroceryItemOrder[10];
    }

    // Method to add an item
    public void add(GroceryItemOrder item)
    {
        groceryItemOrders[pointer] = item;
        pointer++;
    }

    // Method that retruns total sum cost of all grocery item orders
    public double getTotalCost()
    {
        double sum = 0;

        for (GroceryItemOrder prices : groceryItemOrders)
        {
            sum += prices.getCost();
        }
        return sum;
    }

    // toString method
    @Override
    public String toString()
    {
        return "GroceryItemOrders:\n" + Arrays.toString(groceryItemOrders);
    }
}
