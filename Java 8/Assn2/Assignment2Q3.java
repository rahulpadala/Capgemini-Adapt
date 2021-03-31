package Assn2;
import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits - creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
    	int s=0;
    	for(int i:cash)
    	{
    		s=s+i;
    	}
    	return s;
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) 
    {
    	Assignment2Q3 a = new Assignment2Q3();
    	Assignment2Q3 ac = new CurrentAccount();
    	Assignment2Q3 as = new SavingsAccount();
    	ArrayList<Integer> al = new ArrayList<>();
    	al.add(ac.getCash());
    	al.add(as.getCash());
    	System.out.println(a.totalCashInBank(al));
    	

    }
}

