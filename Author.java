public class Author
{
    private String name;
    private String dob;

    public Author(String name, String dob){
        this.name = name;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public String getDOB(){
        return dob;
    }

    public void setName(String Name){
      this.name=Name;
    }

    public void setDOB(String dob){
        this.dob = dob;
    }
}
