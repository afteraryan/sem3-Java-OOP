class SurendraUncle 
{
        SurendraUncle()
        {
            System.out.println("Parent constructor!");
        }
        void Display()
        {
            System.out.println("Uncle");
        }
        void CallParent()
        {
            System.out.println("Calling Parent with super");
        }
}

public class Chirag extends SurendraUncle
{
    Chirag()
    {
        System.out.println("Child constructor!");
    }
    void Display()
    {
        System.out.println("Chirag");
    }
    void CallParent()
    {
        super.CallParent();
    }

    public static void main(String[] args)
    {
        Chirag obj = new Chirag();
        obj.Display();
        obj.CallParent();
    }
} 
