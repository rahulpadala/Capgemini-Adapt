package Assn1;
import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	boolean ans = false;
    	for(int i=0;i<15;i++)
    	{
    		if(arr[i]==toCheckValue)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}

public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]= new int[15];
	    int c;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<15;i++)
		{
			arr[i] = sc.nextInt();
		}
		c = sc.nextInt();
		SearchArray sa = new SearchArray();
		System.out.println(sa.searchArray(arr, c));
		

	}

}
