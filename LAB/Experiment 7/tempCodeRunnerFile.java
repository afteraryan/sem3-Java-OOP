import java.util.*;
class Exception500 extends Exception
{
    public Exception500(String s)
    {
        super(s);
    }
}

class Lessthan500
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");  
        int n= sc.nextInt();
        sc.close();
        try
        {
            if(n<500)
                throw new Exception500("Value less than 500");
            else
                System.out.println("No Exception found!\n");
        }
        catch (Exception500 e)
        {
            System.out.println("Exception Caught: " + e.getMessage() + "\n");
        }
    }
}