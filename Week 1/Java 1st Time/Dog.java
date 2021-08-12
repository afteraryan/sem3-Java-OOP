
public class Dog
{
    String name;
    int age;
    String color;
    String brand;
    public void makeSound()
    {
        System.out.println("bark! ");
    }
    public void makeSound(String x)
    {
        System.out.print("bark! " + x);
    }
}