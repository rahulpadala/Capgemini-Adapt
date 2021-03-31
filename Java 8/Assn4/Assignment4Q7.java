package Assn4;
import java.util.*;
public class Assignment4Q7 {
	 
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("A",1);
		map.put("B",2);
		map.put("C",3);
		map.put("D",4);
		System.out.println(map);
		System.out.println("\n");
		map.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+(entry.getValue())));
	}
};