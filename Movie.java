//Miguel M Querales
//10/7/26
// This class constructs the movie item, and provides setters and getters for it

public class Movie extends Item
{
    private String maker;
    private int duration;

    public Movie(String name, double price, String saleDate, String maker, int duration) {
        super(name, price, saleDate);
        this.maker = maker;
        this.duration = duration;
    }

    @Override 
    public String getMaker() {
        return maker;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setMaker(String maker){
      this.maker=maker;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
}
