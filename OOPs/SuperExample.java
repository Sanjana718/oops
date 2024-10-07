package OOPs;
class parent
{
    int number= 987654321;
    String name;
    int age;

    parent(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void disp()
    {
        System.out.println(name);
        System.out.println(age);
        
    }

}
class child extends parent{
    int number= 123456789;
    String address;
    child(String name, int age, String address)
    {
        super(name,age);
        this.address=address;
    }
    void show()
    {
        System.out.println(address);
        super.disp();  // inherit the void disp method in parent class
        System.out.println(number);
        System.out.println(super.number);  // super keyword inherit the parent class number

    }
    
}

public class SuperExample {
public static void main(String[] args) {
    // parent p1= new parent("Anshika", 15);
    // p1.disp();
    child c1 = new child("Chintu", 24, "Bhopal");
    // c1.disp();
    c1.show();

    
}
}
