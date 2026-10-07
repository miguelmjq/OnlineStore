//Miguel M Querales
//10/7/26
// this class is a parent to movie and book, contains some setters and getters
// the other classes lack 

public class Item
{
    private String name;
    private double price;
    private String saleDate; // mm/dd/yyyy

    public Item(String name, double price, String saleDate){
        this.name = name;
        this.price = price;
        this.saleDate = saleDate;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public String getSaleDate(){
        return saleDate;
    }

    public String getMaker(){
        return "not stated";
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setSaleDate(String saleDate){
        this.saleDate = saleDate;
    }

    public void setName(String name){
        this.name = name;
    }
}
