//package Assignemnt1;
import java.util.*;

public class RowSum 
{
    int n;
    int arr[][];
    void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2D Array size: ");
        n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Enter Values of each Row: ");
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        
    }    

    void Output()
    {
        int Sum = 0;
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + ": " + Sum);
            Sum=0;
        }
    }

    public static void main(String[] args)
    {
        RowSum obj = new RowSum();
        obj.Input();
        obj.Output();
    }
}
