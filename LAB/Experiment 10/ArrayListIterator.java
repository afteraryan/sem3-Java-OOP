import java.util.*;

public class ArrayListIterator 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(-10);
        Iterator<Integer> Itr = arr.iterator();
        while(Itr.hasNext()) 
        {
            System.out.println(Itr.next());
        }
        System.out.println(arr);
        ArrayList<Integer> SecondArray = (ArrayList<Integer>) arr.clone();
        System.out.println(SecondArray);
        Collections.reverse(arr);
        //System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        ArrayList<Integer> Bablu = new ArrayList<Integer>();
    }
    
}

