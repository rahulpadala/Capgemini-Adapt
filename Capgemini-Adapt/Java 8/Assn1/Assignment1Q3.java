package Assn1;
import java.util.Scanner;
import java.lang.Math;
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double si;
    	si = (principalAmount*time*interestRate)/100;
    	return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double ci;
    	ci = ((principalAmount)*(Math.pow((1+interestRate),time))) - principalAmount;
    	return ci;
    }
}


public class Assignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,r;
		int t;
		Scanner sc=new Scanner(System.in);
		p = sc.nextDouble();
		t = sc.nextInt();
		r = sc.nextDouble();
		SiCi sci = new SiCi();
		System.out.println(sci.simpleInterest(p, t , r));
		System.out.println(sci.compoundInterest(p, t , r));
		

	}

}
