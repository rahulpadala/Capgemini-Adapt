package Assn1;
import java.util.Scanner;

class ArmstrongOrNot {
	
	public boolean armstrongCheck(int n)
	{
		int s,c,b=0;
		boolean a = false; 
		s=n;
		while(s>0)
		{
			c = s%10;
			b += c*c*c;
			s = s/10;
		}
		if(n==b)
		{
			return !a;
		}
		return a;

	}

}

public class Assignment1Q1 {

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		ArmstrongOrNot ar = new ArmstrongOrNot();
		n = sc.nextInt();
		System.out.println(ar.armstrongCheck(n));
	}
}
