
import java.util.ArrayList;

/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
 */
public class Store {

    private double profit;
    private ArrayList<Item> items;

    public Store() {
        this.profit = 0.0;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void sellItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getName().equals(itemName)) {
                profit += item.getPrice();
                items.remove(i);
                System.out.println("Sold " + itemName + " for $" + item.getPrice());
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    public void maker(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                System.out.println("Creator of " + itemName + ": " + item.getMaker());
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    public void showItems(){
      System.out.println("Available items:");
    }
}
