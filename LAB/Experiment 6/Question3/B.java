package Q;

import p.A;

public class B
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.Public();
		//obj.Default(); //-> Not Accessible
		//obj.Private(); //-> Not Accessible
		//obj.Protected(); //-> Not Accessible
	}
}