// Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program.
interface compute
{
	int operation(int x, int y);
}
class Addition implements compute
{
	public int operation(int x, int y)
	{
		return x+y;
	}
}
class Multiplication implements compute
{
	public int operation(int x, int y)
	{
		return x*y;
	}
}
class Exp3{
	public static void main(String arg[]){
		Addition a = new Addition();
		Multiplication m = new Multiplication();
		compute InterfaceVar;
		InterfaceVar = a;
		System.out.println("Add: "+InterfaceVar.operation(9,3) + "\n");
		InterfaceVar = m;
		System.out.println("Multiply: "+InterfaceVar.operation(9,3));
	}
}
