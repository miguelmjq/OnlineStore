
public class Book extends Item {

    private Author author;
    private String publisher;

    public Book(String name, double price, String saleDate, Author author, String publisher) {
        super(name, price, saleDate);
        this.author = author;
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCreator() {
        return author.getName();
    }

    public String getAuthDOB(){
        return author.getDOB();
    }
}
