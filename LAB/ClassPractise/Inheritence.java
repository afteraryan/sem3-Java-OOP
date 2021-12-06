class Parent 
{
        Parent()
        {
            System.out.println("Parent constructor!");
        }
        public void Display()
        {
            System.out.println("Parent Method");
        }
}

public class Inheritence extends Parent
{
    Inheritence()
    {
        System.out.println("Child constructor!");
    }
    protected void Display()
    {
        System.out.println("Parent Method");
    }

    public static void main(String[] args)
    {
        Inheritence obj = new Inheritence();
        obj.Display();
    }
} 
