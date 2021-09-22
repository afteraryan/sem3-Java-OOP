import java.util.*;

public class Calc
{
	
	public static long power(int a, int b) throws Exception
    {
		if(a<0 || b<0)
			throw new Exception("a and b should be non-negative");
		else if(a == 0 && b == 0)
			throw new Exception("a and b should not be zero.");
		else 
			return (long)Math.pow(a, b);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Input a & b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try 
        {
			long Result = power(a,b);
			System.out.println("Calculated Result: "+Result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        sc.close();
	}

}