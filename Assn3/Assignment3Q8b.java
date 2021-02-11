package Assn3;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
 
public class Assignment3Q8b
{       
    public static void main(String[] args) 
    {
         
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
         
        map.put(1,"ONE");
         
        map.put(2,"TWO");
 
        map.put(3,"THREE");
         
        map.put(4,"FOUR");
         
         
        Iterator<Integer> itr = map.keySet().iterator();
         
        while (itr.hasNext())
        {
            Integer key = (Integer) itr.next();
             
            System.out.println(key+" : "+map.get(key));
             
            map.put(5,"FIVE");     
        }
    }   
}
