          package OOPs;

abstract class vehicles
{
    abstract void get();
    abstract void set();
}
class car
{
    private String model;
   private int year;
   
     void set(String model, int year)
    {
        this.setmodel(model);
        this.setyear(year);
    
    }
    void get()
    {
        System.out.println(model);
        System.out.println(year);
    }
    public String getmodel()
    {
        return model;
    }
    public void setmodel(String model)
    {
        this.model = model;
    }
    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year = year;
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        car c = new car();
        c.set("Honda",2015);
        c.get();
    }
    
}
