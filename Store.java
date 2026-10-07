//Miguel M Querales
//10/7/26
// this class has all the setters and methods that only the store does

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
    private final ArrayList<Item> items;

    //constructor
    public Store() {
        this.profit = 0.0;
        this.items = new ArrayList<>();
    }

    //precon: a valid item
    //postcon: adds the item to the item list and removes its price from the profit
    public void addItem(Item item) {
        items.add(item);
        profit -= item.getPrice();
    }

    //precon: a valid item name
    //postcon: sells the item and adds its price to the store profit
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

    //precon: a valid string 
    //postcon: prints the maker of the item given
    public void maker(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                System.out.println("Creator of " + itemName + ": " + item.getMaker());
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    //precon: none
    //postcon: returns profit
    public double getProfit() {
        return profit;
    }

    //precon: none
    //postcon: prints a list of all the items currently available
    public void showItems(){
      System.out.println("Available items:");
      for (Item item : items){
        System.out.println("name: "+ item.getName() + ", price: $" + item.getPrice() + ", author: " + item.getMaker());
      }
    }
}
