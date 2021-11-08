import java.util.*;
public class Occurance 
{
    int nonRepeat(String s) 
    {
		int index = -1;
		char arr[] = new char[256];
		for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i)]++;
        }
			
		for(int i = 0; i < s.length(); i++) 
        {
            if(arr[s.charAt(i)] == 1) 
            {
				index = i;
				break;
			}	
		}
		
		return index;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Occurance obj = new Occurance();
		String s;
		System.out.print("Enter String: ");
		s = sc.nextLine();
		int index = obj.nonRepeat(s);
		if(index == -1)
			System.out.println("No Repeating Character!");
		else
        {
            System.out.println("1st Repeated Character is: " + s.charAt(index));

        }
			
	}

}
