//Write a program to create interface named test. In this interface the member function is square. 
//Implement this interface in arithmetic class. Create one new class called ToTestInt. 
//In this class use the object of arithmetic class.

interface test
{
	void square();
}

class arithmetic implements test
{
	public void square()
	{
		System.out.println("Square!");
	}
}

class ToTestInt
{
	public static void main(String arg[])
	{
		test t = new arithmetic();
		t.square();
	}
}	
