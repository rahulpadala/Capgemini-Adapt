package Assn3;

import java.util.*;
import java.util.Map.Entry;    
class DateClass {    
	private int date;
	private int month;
	private int year;
	private String name;     
	public DateClass(int date, int month, int year, String name ) {    
		this.date = date;
		this.month = month;
		this.year = year;
		this.name = name;
	}    
	public int compareTo(DateClass c) {  
		if(date>c.date){  
			return 1;  
		}else if(date<c.date){  
			return -1;  
		}else{
			return 0;
		}
	}
	public int getDate() {
		return date;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String getName() {
		return name;
	}

}
public class Assignment3Q4 {    
	public static void main(String[] args) 
	{    
		//Creating map of Books    
		Map<Integer,DateClass> map=new HashMap<Integer,DateClass>();    
		//Creating Books    
		DateClass b1=new DateClass(13,12,1999,"Rahul");    
		DateClass b2=new DateClass(30,10,1997,"Bunny");    
		DateClass b3=new DateClass(22,6,2000,"Prakash");    
		//Adding Books to map   
		map.put(1,b1);  
		map.put(2,b2);  
		map.put(3,b3);  

		//Traversing map  
		for(Entry<Integer, DateClass> entry:map.entrySet())
		{    
			int key=entry.getKey();  
			DateClass b=entry.getValue();  
			System.out.println("Key: "+key+" Value : ");  
			System.out.println(b.getDate()+"-"+b.getMonth()+"-"+b.getYear()+" "+b.getName());   
		}    
	}    
}
