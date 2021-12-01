import java.util.*;
public class Algorithms 
{
    void SelectionSort(ArrayList <Integer> L , int n)
    {
        for(int i = 0 ; i < n-1 ; i++)
        { 
            int Customindex = i;
            for(int j = i ;j < n; j++)
            {
                if(L.get(Customindex) > L.get(j))
                {
                    Customindex = j;
                }
            }
            Collections.swap(L, i, Customindex);
        }
        System.out.println("ArrayList: ");
        System.out.println(L);
    }
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> i = new ArrayList();
        System.out.println("Enter the number of elements: ");
        int a = sc.nextInt();
        System.out.println("Enter Elements: ");
        for(int j = 0;j < a;j++)
        {
        int in=sc.nextInt();
        i.add(in);
        }
        System.out.println(i);
        Algorithms obj = new Algorithms();
        obj.SelectionSort(i , i.size());
    }
}