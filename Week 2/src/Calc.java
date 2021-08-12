public class Calc {
	void sum (int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main (String[] args) {
		Calc obj = new Calc();
		obj.sum(20, 20);
		obj.sum(20,20,20);
		
	}
}