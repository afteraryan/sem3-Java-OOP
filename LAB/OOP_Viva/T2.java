class TT implements Runnable 
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
 
class T2 
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) {
            TT obj = new TT();
            Thread obj2 = new Thread(obj);
            obj1.start();
        }
    }
}

