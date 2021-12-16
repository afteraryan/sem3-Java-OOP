class Tution implements Runnable
{
	public void run()
	{
		//System.out.println("Thread is running...");
		for(int i=1; i<4; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

class Main
{
	public static void main (String args[])
	{
		Tution Bablu= new Tution();
		Thread t1 = new Thread(Bablu);
		Thread t2 = new Thread(Bablu,"Bunty");
		t1.start();
		/*try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		System.out.println(t1.getName());	
		System.out.println("_____________________________");
		t2.start();	
	}
}