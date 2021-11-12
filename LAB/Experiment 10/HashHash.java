import java.util.*;
public class HashHash 
{
    public static void main(String[] args) 
    {
		Scanner SC1 = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(99, "Ninty Nine");
		map.put(100, "Hundred");
        map.put(200, "Two Hundred");
		System.out.println(map);
		
		System.out.print("Enter Key: ");
		int k = SC1.nextInt();
		if(map.containsKey(k))
			System.out.println("Key present!");
		else
			System.out.println("Key not present!");
		System.out.print("Enter Value: ");
		String v = SC1.next();
		if(map.containsValue(v))
			System.out.println("Value Present!");
		else
		System.out.println("Value not present!");
        System.out.println("\nAll Keys-");
        for(Integer m: map.keySet()) 
        {
            System.out.println(m);
        }
        System.out.println("\nKey-Value Pairs-");
        for(Map.Entry<Integer, String> m: map.entrySet()) 
        {
            System.out.println(m.getKey() + ": " +m.getValue());
        }
        
	}


}
