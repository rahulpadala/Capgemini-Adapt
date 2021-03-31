package Assn3;
import java.util.*;
public class Assignment3Q3 {
	public static List<Integer> traverseReverse(ArrayList<Integer> aList)
	{
		List<Integer> l = new ArrayList<>();
		ListIterator<Integer> it = aList.listIterator(aList.size());
		while(it.hasPrevious())
		{
			l.add(it.previous());
		}
		return l;

	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(6);
	   System.out.println(Assignment3Q3.traverseReverse(al));
	}
}
