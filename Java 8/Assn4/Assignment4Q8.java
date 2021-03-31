package Assn4;

import java.util.ArrayList;

public class Assignment4Q8 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
	
	Thread t=new Thread()
	{
		 public void run(){
			 System.out.println(a);
		 }
	};
	t.start();
	}
}