import java.util.*;
public class HashHashSet
{
    public static void main(String[] args) 
    {
		int UserInput;
		HashSet<Integer> OriginalSet = new HashSet<Integer>();
		HashSet<Integer> CopySet = new HashSet<Integer>();
		OriginalSet.add(15);
		OriginalSet.add(30);
		OriginalSet.add(45);
		CopySet.add(60);
		CopySet.add(75);
		OriginalSet.addAll(CopySet);
		System.out.println("Set: "+OriginalSet+"\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Object: ");
		UserInput= sc.nextInt();
		Integer i  = Integer.valueOf(UserInput);
		if(OriginalSet.contains(i))
			System.out.println("Present!");
		else
			System.out.println("Not Present");
        OriginalSet.clear();

		OriginalSet.clear();
		System.out.println("All Entries deleted! ");
		System.out.println("\nSet: "+OriginalSet);
	}
    
}
