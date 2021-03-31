package Assn4;
import java.util.*;
public class Assignment4Q5 {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
			
		System.out.println("The list is : "+list);
		list.stream().forEach(x -> System.out.println(x.charAt(0)));

	}

}
