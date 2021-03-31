package Assn3;
import java.util.*;
import java.lang.*;
class P{
	private String name;
	public P(String n)
	{
		name = n;
	}
	public String toString()
	{
		return "Name :"+name;
	}

}

public class Assignment3Q2 {
	public static void main(String[] args) {
	    Set<Integer> lhs = new LinkedHashSet<>();
	    lhs.add(1);
	    lhs.add(7);
	    lhs.add(6);
	    lhs.add(4);
	    lhs.add(8);
	    System.out.println("The LinkedHashSet Elements :");
	    for(int i:lhs)
	    {
	    	System.out.println(i);
	    }
	    Set<Integer> hs = new HashSet<>();
	    hs.add(1);
	    hs.add(7);
	    hs.add(6);
	    hs.add(4);
	    hs.add(8);
	    System.out.println("The HashSet Elements :");
	    for(int i:hs)
	    {
	    	System.out.println(i);
	    }


	}
}


