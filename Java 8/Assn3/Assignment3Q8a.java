package Assn3;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment3Q8a 
{       
    public static void main(String[] args) 
    {
         
        ArrayList<Integer> list = new ArrayList<Integer>();
  
        list.add(1);
         
        list.add(2);
         
        list.add(3);
         
        list.add(4);
         
        list.add(5);
         
        //Getting an Iterator from list
         
        Iterator<Integer> it = list.iterator();
         
        while (it.hasNext())
        {
            Integer i = (Integer) it.next();
            System.out.println(i);
            list.add(6); //ConcurrentModificationException     
        }
    }   
}