class EvenThread extends Thread{
	public void run() {
		for(int i = 0; i<=10; i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
	}
}
	
class OddThread extends Thread{
	public void run() {
		for(int i = 0; i<=10; i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
	}
}
public class ThreanEvenOdd 
{
    public static void main(String[] args)
    {
        EvenThread TE = new EvenThread();
        TE.start();
        OddThread TO = new OddThread();
        TO.start();
    }
}
