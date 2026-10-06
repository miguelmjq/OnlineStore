
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Author a = new Author("Nikhil Abraham", "NA");
        Book b = new Book("Coding For Dummies", 36.99, "06/13/2016", a, "Wiley");
        System.out.println(b instanceof Item);
        s.addItem(b);
        s.addItem(b);
        s.addItem(b);
        s.addItem(b);
        s.showItems();
        s.sellItem(b.getName());
        s.sellItem(b.getName());
        System.out.println(s.getProfit());
        s.showItems();
        }
}
