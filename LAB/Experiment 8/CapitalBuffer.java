import java.util.*;

public class CapitalBuffer 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
        System.out.println("Enter a String: ");
		String s = sc.nextLine();
		str.append(s);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char c = str.charAt(i);
				c = (char)((int)c - 32);
				str.setCharAt(i, c);
			}
		}
		System.out.println("Capital Converted: " + str);
		sc.close();
    }
}
