// Write a program to create an Interface having two methods division and modules. 
// Create a class, which overrides these methods.

interface subject
{
	void division(int x, int y);
	void modules(int a, int b);
}
class sub implements subject
{
	int VarDiv, VarMod;
	public void division(int x, int y)
	{
		VarDiv = x/y;
	}
	public void modules(int a, int b)
	{
		VarMod = a%b;
	}
	void print(){
		System.out.println("Division: "+VarDiv + "\n");
		System.out.println("Modules: "+VarMod);
	}
}
class Exp4
{
	public static void main(String arg[])
	{
		sub Interface = new sub();
		Interface.division(20,4);
		Interface.modules(15,7);
		Interface.print();
	}
}
