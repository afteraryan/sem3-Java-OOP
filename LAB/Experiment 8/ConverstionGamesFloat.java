public class ConverstionGamesFloat 
{
    public static void main(String[] args) {
		float f = 99f;
		Float V1 = Float.valueOf(f);
		System.out.println("float to Float: " + V1);
		String Str = String.valueOf(V1);
		System.out.println("Float to String: " + Str);
		float V2 = Float.parseFloat(Str);
		System.out.println("String to float: " + V2);
		String Str2 = String.valueOf(V2);
		System.out.println("float to String: " + Str2);
		Float V3 = Float.valueOf(Str2);
		System.out.println("String to Float: " + V3);
		float V4 = V3.floatValue();
		System.out.println("Float to float: " + V4);
	}
    
}
