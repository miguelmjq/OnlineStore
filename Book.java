//Miguel M Querales
//10/7/26
// this class constructs the book item and has setters and getters 

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

    @Override 
    public String getMaker() {
        return author.getName();
    }

    public String getAuthDOB(){
        return author.getDOB();
    }

    public void setAuthor(Author auth){
        this.author = auth;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}

