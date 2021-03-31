package Assn4;

import java.util.Scanner;

interface Q2{
	public String Order(int a);
	}

public class Assignment4Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Q2 order= a-> {
			if(a>10000)
				return "Accepted";
			else
			return "Not Accpeted";
			
			
		};
		System.out.print(order.Order(i));
		
	}
}
