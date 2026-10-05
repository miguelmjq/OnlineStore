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

    
}
