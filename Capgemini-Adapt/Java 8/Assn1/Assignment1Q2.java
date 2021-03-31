package Assn1;

import java.util.ArrayList;

class ArmstrongNumBetweenRange{
	public int[] armstrongNumbersInRange(int min , int max){
		ArrayList<Integer> Ar = new ArrayList<Integer>();
		for(int i=min;i<max;i++)
		{
			int s,c,b=0;
			boolean a = false; 
			s=i;
			while(s>0)
			{
				c = s%10;
				b += c*c*c;
				s = s/10;
			}
			if(i==b)
			{
				Ar.add(i);
			}
		}
		int l=Ar.size();
		int[] ss = new int[l];
		for(int i=0;i<l;i++)
		{
			ss[i]=Ar.get(i);
		}
		
		return ss;
	}
}

public class Assignment1Q2 {

	public static void main (String [] args) {

		int min = 100 , max = 999;
		ArmstrongNumBetweenRange an = new ArmstrongNumBetweenRange();
		int l = an.armstrongNumbersInRange(min, max).length;
		for(int i=0;i<l;i++)
		{
			System.out.println(an.armstrongNumbersInRange(min, max)[i]);
		}
		

	}
}
