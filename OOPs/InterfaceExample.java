package OOPs;

interface Draw
{
    final int a = 10;
    public abstract void draw();
}
class rectangle implements Draw 
{
    int a=45;
    public void draw()
    {
        System.out.println("drawing rectangle");
        System.out.println(a);
    }

}
class square implements Draw
{
    public void draw()
    {
        System.out.println("drawing Square");

    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Draw r= new rectangle();
        r.draw();
        Draw s = new square();
        s.draw();
    }
    
}
