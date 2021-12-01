import java.util.*;
public class JDBC2
{
    void remove(ArrayList <Integer> L)
    { 
        if(L.get(0) == null)
        {
            throw new NoSuchElementException("PQ is Empty");
        }
        else
        {
            L.remove(0);
            Collections.sort(L);
        }
    }
    boolean add(ArrayList <Integer> L , int i)
    { 
        L.add(i);
        Collections.sort(L);
        return true;
    }
    int peek(ArrayList <Integer> L)
    {
        if(L.get(0) == null)
        {
            throw new NoSuchElementException("PQ is empty");
        }
        else
        {
            return L.get(0);
        }
    }
    boolean isEmpty(ArrayList <Integer> L)
    { 
        if(L.get(0) == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> L = new ArrayList();
        JDBC2
        obj = new JDBC2
        ();
        int c = 0;
        while(c!=6)
        {
            System.out.println("\n\n----------------------------------------\nSelect Action:: ");
            System.out.println("1.Remove Element");
            System.out.println("2.Add Element");
            System.out.println("3.Peek Topmost");
            System.out.println("4.Empty Check");
            System.out.println("5.Display");
            System.out.println("6.Exit!");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                try 
                        {
                            obj.remove(L);
                        }
                        catch(Exception e)
                        {
                            System.out.println("NoSuchElementException");
                        }
                        break;
                case 2:
                        System.out.println("Enter Number: ");
                        int in = sc.nextInt();
                        System.out.println(obj.add(L , in));
                        break;
                case 3:
                        try 
                        {
                            System.out.println(obj.peek(L));
                        }
                        catch(Exception e)
                        {
                            System.out.println("NoSuchElementException");
                        }
                        break;
                case 4:
                        System.out.println(obj.isEmpty(L));
                        break;
                case 5:
                        System.out.println(L);
                        break;
                case 6:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Enter Task Number: ");
                        main(null);
            }
        }
    }
}