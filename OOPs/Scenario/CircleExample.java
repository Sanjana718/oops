
// Question 3. Write a program to create a class called "Circle" with a radius attribute. you can access and modify this attribute. 
// Calculate the area and cicumference of the circle.



package OOPs.Scenario;
 
class circle
{
    double radius;
    static double PI = (22/7);
    circle(double radius)
    {
        this.radius= radius;
    }
    void modify(double radius)
    {
        this.radius=radius;
    }
    double Area()
    {
        double area= PI*(Math.pow(radius, radius));
        return area;

    }
    double cicumference()
    {
        double cir= 2*Math.PI*radius;
        return cir;
    }

}

public class CircleExample {
    public static void main(String[] args) {
        
        circle c1 = new circle(3.6);
        c1.modify(2.756);
        System.out.println(c1.Area());
        System.out.println(c1.cicumference());

    }
    
    
}
