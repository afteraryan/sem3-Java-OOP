import java.util.*;
public class HashMapRatri 
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Aryan",22);
        hm.put("Arya",21);
        hm.put("Ary",25);
        //hm.clear();
        HashMap<String, Integer> hm2 = new HashMap<String,Integer>();
        hm2.put("Riya",1);
        hm2.put("Riy",2);
        hm.putAll(hm2);
        System.out.println(hm);
    }
    
}
