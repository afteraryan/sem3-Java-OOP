import java.util.*;

public class ArrayListIterator 
{
    public static void main(String[] args) 
    {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		Iterator<Integer> Itr = arr.iterator();
		while(Itr.hasNext()) 
        {
			System.out.println(Itr.next());
		}
		System.out.println(arr);
        ArrayList<Integer> arr1 = (ArrayList<Integer>) arr.clone();
		System.out.println(arr1);
		Collections.reverse(arr);
		System.out.println(arr);
		
	}
    
}
