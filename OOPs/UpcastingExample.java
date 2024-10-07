package OOPs;
class Animal5
{
    void eat()
    {
        System.out.println("Animal is eating");
    }

}
class Dog5 extends Animal5
{
    void eat()
    {
        System.out.println("Dog is eating");
    }
}

public class UpcastingExample {
public static void main(String[] args) {
    Animal5 d1 = new Dog5(); // upcasting 
    d1.eat();
    // Animal5 a1 = (Dog5) new Animal5(); // downcasting in the run time the late binding error is given .
    // a1.eat();
    System.out.println(d1 instanceof Animal5); // instance of operator is used to check the object belongs to which class.
    
}
    
}
