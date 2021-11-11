class CountingThread extends Thread
{
	static int counter = 0;
	public void run() {
		counter = inc(counter);
	}
	public synchronized int inc(int i) {
		i++; 
		return i;
	}
}

public class ThreadSync 
{
    public static void main(String[] args) 
    {
		CountingThread TE1 = new CountingThread();
		CountingThread TE2 = new CountingThread();
		CountingThread TE3 = new CountingThread();
		CountingThread TE4 = new CountingThread();
		CountingThread TE5 = new CountingThread();
		CountingThread TE6 = new CountingThread();
		CountingThread TE7 = new CountingThread();
		CountingThread TE8 = new CountingThread();
		CountingThread TE9 = new CountingThread();
		CountingThread TE10 = new CountingThread();
		TE1.start();
		TE2.start();
		TE3.start();
		TE4.start();
		TE5.start();
		TE6.start();
		TE7.start();
		TE8.start();
		TE9.start();
		TE10.start();
        System.out.println(CountingThread.counter);
    }
}
