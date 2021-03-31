package Assn1;
import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double a=0;
    	if(ctc >= 0 && ctc <= 180000)
    	{
    		a = ctc;
    	}
    	else if(ctc >= 180001 && ctc <= 300000)
    	{
    		a = 0.1*ctc;
    	}
    	else if(ctc >= 300001 && ctc <= 500000)
    	{
    		a = 0.2*ctc;
    	}
    	else if(ctc >= 500000 && ctc <= 1000000)
    	{
    		a = 0.3*ctc;
    	}
    	
    	return a;
    }
}

public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct;
		Scanner sc = new Scanner(System.in);
		ct = sc.nextInt();
		TaxAmount tx = new TaxAmount();
		System.out.println(tx.calculateTaxAmount(ct));
		

	}

}
