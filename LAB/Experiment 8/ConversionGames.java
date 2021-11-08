public class ConversionGames 
{
    public static void main(String[] args) {
		int a = 99;
		System.out.println("The int value is: " + a);
		Integer inta = Integer.valueOf(a);
		System.out.println("int to Integer: " + inta);
		String s = Integer.toString(inta);
		System.out.println("Integer to String: " + s);
		int Int2Str = Integer.parseInt(s);
		System.out.println("String to int: " + Int2Str);
		String Str2Int = String.valueOf(Int2Str);
		System.out.println("int to String: " + Str2Int);
		Integer Str22Int = Integer.valueOf(Str2Int);
		System.out.println("String to Integer: " + Str22Int);
		int IntFinal = Str22Int.intValue();
		System.out.println("Integer to int: " + IntFinal);
	}
    
}
