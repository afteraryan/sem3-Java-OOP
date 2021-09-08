

public class lab2_calculator
{
    public static void main (String args[])
    {
        int m,n;

        m=Integer.parseInt(args[0]);
        n=Integer.parseInt(args[1]);

        int sum = m + n;
        System.out.println("Sum = "+sum);

        int diff = m - n;
        System.out.println("Difference = "+diff);

        int mul = m * n;
        System.out.println("Multiply = "+mul);

        int div = m / n;
        System.out.println("Division = "+div);

    }
}