package Assn3;
import java.util.*;
import java.lang.*;
class Person implements Comparable<Person>{
	private String name;
	private int height;
	private double weight;
	public Person(String n,int h,double w)
	{
		name = n;
		height = h;
		weight = w;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.weight==o.weight)
		{
			if(this.height > o.height)
			{
				return 1;
			}else
			{
				return -1;
			}
		}
		if(this.weight > o.weight)
		{
			return 1;
		}
		else{  
			return -1;  
		}
	}
	public String toString()
	{
		return "Name :"+name;
	}

}

public class Assignment3Q1 {
	public static void main(String[] args) {
		Set<Person> tr = new TreeSet<>();
		Person p1 = new Person("rahul",6,60);
		Person p2 = new Person("vinay",5,60);
		Person p3 = new Person("prakash",6,40);
		tr.add(p1);
		tr.add(p2);
		tr.add(p3);
		System.out.println(tr);


	}
}


