//Question 1. Write a java program to create a class called "person" with a name and age attribute. 
// create two intsance of the "person" class, set their attributes using the constructor , and print their name and age?


package OOPs.Scenario;



public class PersonClass {
    String name;
    int age;

    PersonClass(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void disp()
    {
        System.out.println("The name is :"+name);
        System.out.println("The age is :"+age);
    }
    public static void main(String[] args) {
        PersonClass p1 =new PersonClass("pintu",12);
        p1.disp();
        PersonClass p2 = new PersonClass("chintu",15);
        p2.disp();
    }
    
}
