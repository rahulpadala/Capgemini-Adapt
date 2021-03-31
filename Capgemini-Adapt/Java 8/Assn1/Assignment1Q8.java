package Assn1;
import java.util.Scanner;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	int n = arr.length;
    	int l = n-1;
    	while(l>0)
    	{
    		for(int i=0;i<l;i++)
    		{
    			if(arr[i]>arr[i+1])
    			{
    				int t;
    				t = arr[i];
    				arr[i] = arr[i+1];
    				arr[i+1]=t;
    			}
    		}
    		l--;
    	}
    	return arr;
    }
}

public class Assignment1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the array size");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		BubbleSort bb = new BubbleSort();
		int b[] = bb.bubbleSort(a);
		for(int i = 0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
