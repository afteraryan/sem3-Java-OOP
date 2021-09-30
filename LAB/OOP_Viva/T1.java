class TTT extends Thread 
{
    public void run()
    {
        try 
        {
            System.out.println("Thread " + Thread.currentThread().getId());
        }
        catch (Exception e) 
        {
            System.out.println("Caught");
        }
    }
}
 
public class T1 {
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) 
        {
            TTT obj = new TTT();
            obj.start();
        }
    }
}