class ThreadClass extends Thread
{
	public void run() {};
}



public class ThreadLive 
{
    public static void main(String[] args) 
    {
	
		ThreadClass TE1 = new ThreadClass();
		ThreadClass TE2 = new ThreadClass();
		ThreadClass TE3 = new ThreadClass();
		ThreadClass TE4 = new ThreadClass();
		ThreadClass TE5 = new ThreadClass();
		TE1.setPriority(Thread.NORM_PRIORITY + 5);
		TE2.setPriority(Thread.MIN_PRIORITY);
		TE3.setPriority(Thread.NORM_PRIORITY + 3);
		TE4.setPriority(Thread.NORM_PRIORITY - 3);
		TE5.setPriority(Thread.NORM_PRIORITY + 4);
		TE1.start();
		TE2.start();
		TE3.start();
		TE4.start();
		TE5.start();
		System.out.println("Is thread one alive? " + TE1.isAlive());
		System.out.println("Is thread one alive? " + TE2.isAlive());
		System.out.println("Is thread one alive? " + TE3.isAlive());
		System.out.println("Is thread one alive? " + TE4.isAlive());
		System.out.println("Is thread one alive? " + TE5.isAlive());
		try {
			TE1.sleep(1000);
			TE5.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		TE1.stop();
		TE2.stop();
		TE3.stop();
		TE4.stop();
		TE5.stop();
    }

}
