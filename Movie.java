public class Movie extends Item
{
    private String maker;
    private int duration;

    public Movie(String name, double price, String saleDate, String maker, int duration) {
        super(name, price, saleDate);
        this.maker = maker;
        this.duration = duration;
    }

    public String getMaker() {
        return maker;
    }
    
    public int getDuration() {
        return duration;
    }
}
