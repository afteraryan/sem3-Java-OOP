import java.util.Scanner;
public class Marks {
    public static void arraysort(float[] arr)
    {
        float temp = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            { 
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    void Report(float[] arr)
    {
        //System.out.println("Enter Marks: \n");
        Scanner sc = new Scanner(System.in);;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter Marks of Student " + (i+1) + " : ");
            arr[i]= sc.nextInt();
        }
        sc.close();

        arraysort(arr);

        System.out.println("\n-------Report-------\n");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>75)
                System.out.println(arr[i] + ": DISTINCTION");
            else if(arr[i]>=51 && arr[i] <= 75)
                System.out.println(arr[i] + " MERIT");
            else if(arr[i]>=40 && arr[i] <= 50)
                System.out.println(arr[i] + " PASS");
            else
                System.out.println(arr[i] + " Fail");
        }
    }

    public static void main(String[] args)
    {
        float marksarray[];
        marksarray = new float[10];
        Marks obj = new Marks();
        obj.Report(marksarray);
    }
}
