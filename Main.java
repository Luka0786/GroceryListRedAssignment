import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        GroceryList groceryList = createGroceryList("");
        GroceryList2 groceryList2 = createGroceryList2();

        // printing out grocerylist from the file items.txt
       System.out.println("Reading from file items.txt:\n" + groceryList);

        // printing out from an arraylist
        System.out.println("Printing out the item from an ArrayList\n" + groceryList2);

        // printing out the prices
        System.out.println("Total cost of items in the list: " + groceryList.getTotalCost());
        System.out.println("Total cost of items in the list (ArrayList): " + groceryList2.getTotalCost());

    }

    // Method that hardcodes the grocery items and adding them to the array
    private static GroceryList createGroceryList() {
        GroceryList value = new GroceryList();

        // Creating items
        value.add(new GroceryItemOrder("Orange", 1, 2.00));
        value.add(new GroceryItemOrder("Orange", 1, 2.00));
        value.add(new GroceryItemOrder("Coconut", 3,18.00));
        value.add(new GroceryItemOrder("Banana", 6, 1.00));
        value.add(new GroceryItemOrder("Water melon", 2,14.00));
        value.add(new GroceryItemOrder("Peach", 1, 3.00));
        value.add(new GroceryItemOrder("Papaya", 3, 23.00));
        value.add(new GroceryItemOrder("Apple", 10,2.00));
        value.add(new GroceryItemOrder("Lemon", 5, 7.00));
        value.add(new GroceryItemOrder("Lime", 4,6.00));

        return value;
    }

    // Method that hardcodes the grocery items and adding them to the ArrayList
    private static GroceryList2 createGroceryList2(){
        GroceryList2 addToArrayList = new GroceryList2();

        // Creating items to the ArrayList
        addToArrayList.add(new GroceryItemOrder("Orange2", 10, 4.00));
        addToArrayList.add(new GroceryItemOrder("Orange2", 10, 2.00));
        addToArrayList.add(new GroceryItemOrder("Coconut2", 30,36.00));
        addToArrayList.add(new GroceryItemOrder("Banana2", 60, 2.00));
        addToArrayList.add(new GroceryItemOrder("Water melon2", 20,28.00));
        addToArrayList.add(new GroceryItemOrder("Peach2", 10, 6.00));
        addToArrayList.add(new GroceryItemOrder("Papaya2", 30, 46.00));
        addToArrayList.add(new GroceryItemOrder("Apple2", 100,4.00));
        addToArrayList.add(new GroceryItemOrder("Lemon2", 50, 14.00));
        addToArrayList.add(new GroceryItemOrder("Lime2", 40,12.00));

        return addToArrayList;
    }

    // Method that reads the items from the file items.txt and adding them to the array
    private static GroceryList createGroceryList(String youDontNeedMe) {
        GroceryList value = new GroceryList();
        File file = new File("items.txt");
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] itemsFromFile = nextLine.split(";");
                value.add(new GroceryItemOrder(itemsFromFile[0],
                        Integer.parseInt(itemsFromFile[1]),
                        Double.parseDouble(itemsFromFile[2])));
            }
        }

        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
        return value;
    }
}