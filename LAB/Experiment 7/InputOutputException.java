import java.util.*;

public class InputOutputException {
    public static void main(String[] args)
    {
        int a,b;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a & b: ");
            a= sc.nextInt();
            b= sc.nextInt();
            sc.close();
            try
            {
                System.out.println(a + "/" + b + " = " + a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        
    }
}
