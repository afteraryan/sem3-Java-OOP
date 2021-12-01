import java.util.*;
public class JDBC3
{
    static int[][] mat = new int[3][3];
    static int[][] mat2 = new int[3][3];
    static int[][] result = new int[3][3];
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Elements Matrix 1: ");
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat[i].length; j++) 
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Elements Matrix 2: ");
        for (int i = 0; i < mat2.length; i++) 
        {
            for (int j = 0; j < mat2[i].length; j++) 
            {
                mat2[i][j]=sc.nextInt();
            }
        }

        try
        {
            Multiply multiply = new Multiply(3,3);
            MatMultiply thread1 = new MatMultiply(multiply);
            MatMultiply thread2 = new MatMultiply(multiply);
            MatMultiply thread3 = new MatMultiply(multiply);
            Thread th1 = new Thread(thread1);
            Thread th2 = new Thread(thread2);
            Thread th3 = new Thread(thread3);
            th1.start();
            th2.start();
            th3.start();
            th1.join();
            th2.join();
            th3.join();
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("\n\nResult: ");
        for (int i = 0; i < result.length; i++) 
        {
            for (int j = 0; j < result[i].length; j++) 
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Multiply extends JDBC3
{
    private int i;
    private int j;
    private int chance;
    public Multiply(int i, int j)
    {
        this.i=i;
        this.j=j;
        chance=0;
    }
    public synchronized void multiplyMatrix()
    {
        int sum=0;
        int a=0;
        for(a=0;a<i;a++)
        {
            sum=0;
            for(int b=0;b<j;b++)
            {
                sum=sum+mat[chance][b]*mat2[b][a];
            }
            result[chance][a]=sum;
        }
        if(chance>=i)
        return;
        chance++;
    }
}

class MatMultiply implements Runnable 
{
    private final Multiply mul;
    public MatMultiply(Multiply mul)
    {
        this.mul=mul;
    }
    public void run() 
    {
        mul.multiplyMatrix();
    }
}