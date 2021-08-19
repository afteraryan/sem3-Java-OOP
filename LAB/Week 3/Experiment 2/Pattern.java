public class Pattern 
{
    void printpattern()
    {
        int n=3;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<(2*i+1); j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)
    {
        Pattern obj = new Pattern();
        obj.printpattern();
    }
}
