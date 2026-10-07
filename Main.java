//Miguel M Querales
//10/7/26
// this class runs the tests

public class Main {
    //Your tests go here! I expect you to make sure various parts of your program work. 

    public static void main(String[] args) {
        Store s = new Store();
        Author a = new Author("Nikhil Abraham", "NA");
		Author a2 = new Author("Menchukov", "01/02/1682");
        Book b = new Book("Coding For Dummies", 36.99, "10/6/2026", a, "Wiley");
		Book b2 = new Book("book b2", 99.99, "10/6/2026", a2, "NA");
        Movie m = new Movie("Spider-Man 3", 10.00, "10/6/2026", "Sony", 139);
        System.out.println(b instanceof Item);
        s.addItem(m);
        s.addItem(b);
        s.showItems();
        s.sellItem(m.getName());
		s.addItem(b2);
		s.showItems();
		s.maker(b2.getName());
    }
}
