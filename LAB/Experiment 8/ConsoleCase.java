public class ConsoleCase 
{
    public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append(args[0]);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char c = str.charAt(i);
				c = (char)((int)c - 32);
				str.setCharAt(i, c);
			}
		}
		System.out.println("Capital Converted: " + str);
	}
    
}
