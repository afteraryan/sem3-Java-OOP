import java.util.*;

public class Atimes 
{
    public static void main(String[] args) 
    {
		int Ticker = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
		String s = sc.nextLine();
		String str = new String(s);
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				Ticker++;
				result.append(i + " ");
			}
		}
		if(Ticker != 0) {
			System.out.println("Number of occurences: " + Ticker);
			System.out.println("The index of occurences: " + result);
		}
		else {
			System.out.println("Character not present");
		}
	}

    
}
