package OOPs;
abstract class Test
{
   static void eat()
    {
        System.out.println("eating");
    }
    abstract void sleep();
}
class Demo1
{
    void sleep()
    {
        System.out.println("sleeping");
    }
}
class Demo2
{
    void sleep()
    {
        System.out.println("sleep");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Test.eat();
        Demo1 d1 = new Demo1();
        d1.sleep();
        Demo2 d2= new Demo2();
        d2.sleep();
    }
    
}
