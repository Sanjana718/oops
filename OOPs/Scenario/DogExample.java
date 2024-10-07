// Questions 2. Write a java program to create a class called "dog" with a name and breed attribute. Create two instances of the "dog" class,
//set their attributes using the constructor and modify the attributes using the setter methods and print the updated values?


package OOPs.Scenario;

class Dog
{
    String name;
    String breed;

    Dog(String name, String breed)
    {
        this.name=name;
        this.breed=breed;
    }
    void setter(String name, String breed) 
    {
        this.name=name;
        this.breed=breed;

    }
    void disp()
    {
        System.out.println("The name is :" +name);
        System.out.println("The breed is :"+breed);
    }

}

public class DogExample {
   
    public static void main(String[] args) {
        Dog d1= new Dog("jully", "Labrador");
        Dog d2 = new Dog("Max","Golden Retriever");
        d1.setter("doggyyy","pug");
        d1.disp();
        d2.setter("Sheru", "Maltese");
        d2.disp();
        
    }
    
}
