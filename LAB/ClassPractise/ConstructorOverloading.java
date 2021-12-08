public class ConstructorOverloading 
{
    ConstructorOverloading()
    {
        System.out.println("Constructor 1");
    }
    ConstructorOverloading(String S)
    {
        System.out.println(S);
    }
    ConstructorOverloading(String S, int n)
    {
        System.out.println(S + n);
    }
    ConstructorOverloading(int n)
    {
        System.out.println("Constructor " + n);
    }
    public static void main(String[] args)
    {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj2= new ConstructorOverloading("Constructor 2");
        ConstructorOverloading obj3 = new ConstructorOverloading("Constructor ",3);
        ConstructorOverloading obj4 = new ConstructorOverloading(4);
    }
   
}
