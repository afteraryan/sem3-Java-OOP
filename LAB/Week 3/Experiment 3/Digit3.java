import java.util.*;
public class Digit3 
{
    public static void Sort(int[] arr)
    {
        int temp=0;
        for(int i=0; i<arr.length ; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }   
    }

    void NumberCreator(int[] userinput)
    {
        int arr[];
        arr = new int[10];
        int l=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        arr[l]= userinput[i]*100 + userinput[j]*10 + userinput[k];
                        l++;
                    }
                    
                }
            }
        }
        Sort(arr);
        System.out.println("\n-------------------------\n");
        System.out.println(arr[5] + " \n");
        int i=0;
        while(i<6)
        {
            if((arr[i]!=arr[i+1]))
            {
                
                System.out.println(arr[i] + " \n");
            }
            i++;  
        }

    }

    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        System.out.println("Enter 3 numbers: ");
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Digit3 obj= new Digit3();
        obj.NumberCreator(arr);

    }
}
