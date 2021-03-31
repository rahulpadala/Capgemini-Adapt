package Assn4;
import java.util.*;
public class Assignment4Q6 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("rahul");
		list.add("reddy");
		list.add("vinay");
		list.add("arjun");
		list.stream().forEach(x->System.out.println(x.replaceAll(x, x.toUpperCase())));
	
	}
}