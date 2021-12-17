import java.util.*;

public class CollectionsArrayListRatri 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> Bablu = new ArrayList<Integer>();
        Bablu.add(69);
        Bablu.add(96);
        Bablu.add(-69);
        //System.out.print(Bablu);
        /*Iterator itr = Bablu.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/
        Collections.sort(Bablu);
        Collections.reverse(Bablu);
        //Bablu.clear();
        ArrayList<Integer> Ji = new ArrayList<Integer>();
        Ji.add(66);
        Ji.add(99);
        Ji.add(99);
        Bablu.addAll(Ji);
        System.out.println(Bablu);
    }    
}
