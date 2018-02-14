import java.util.ArrayList;

public class GroceryList2 {
    // Variables
    private ArrayList<GroceryItemOrder> arrayListGrocery;

    // Constructor to grocerylist
    public GroceryList2()
    {
        arrayListGrocery = new ArrayList<GroceryItemOrder>();
    }

    // Method to add an item
    public void add(GroceryItemOrder item)
    {
        arrayListGrocery.add(item);
    }

    // Method that retruns total sum cost of all grocery item orders
    public double getTotalCost()
    {
        double sum = 0;

        for (GroceryItemOrder prices : arrayListGrocery)
        {
            sum += prices.getCost();
        }
        return sum;
    }

    // toString method
    @Override
    public String toString() {
        return "GroceryList2:\n" + arrayListGrocery;
    }
}
