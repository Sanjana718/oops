package OOPs;

interface calculation
{
    public abstract void add();
    public abstract void subtract();
    public abstract void multiply();
    public abstract void divide();

}
class caculator implements calculation
{
    public int num1,num2;
    public void add()
    {
        System.out.println(num1+num2);
    }
    public void subtract()
    {
        System.out.println(num1-num2);
    }
    public void multiply()
    {
        System.out.println(num1*num2);
    }
    public void divide()
    {
        if(num2==0)
        {
            System.out.println("Error division");
        }
        else
        {
            System.out.println(num1/num2);
        }
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        calculation c= new caculator();
        ((caculator)c).num1=67;
        ((caculator)c).num2=96;
        c.add();
        c.subtract();
        c.multiply();
        c.divide();


    }
    
}
