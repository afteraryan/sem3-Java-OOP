public class ConstructorOverloading 
{
    void ConstructorOverloaded()
    {
        System.out.println("Constructor 1");
    }
    void ConstructorOverloaded(String S)
    {
        System.out.println(S);
    }
    void ConstructorOverloaded(String S, int n)
    {
        System.out.println(S + n);
    }
    void ConstructorOverloaded(int n)
    {
        System.out.println("Constructor " + n);
    }
    public static void main(String[] args)
    {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj2= new ConstructorOverloading();
        ConstructorOverloading obj3 = new ConstructorOverloading();
        ConstructorOverloading obj4 = new ConstructorOverloading();
        obj.ConstructorOverloaded();
        obj2.ConstructorOverloaded("Constructor 2");
        obj3.ConstructorOverloaded("Constructor ",3);
        obj4.ConstructorOverloaded(4);
    }
   
}
