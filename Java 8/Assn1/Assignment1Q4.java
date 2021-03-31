package Assn1;
import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	String s1 = "passed";
    	String s2 = "promoted";
    	String s3 = "failed";
    	if(subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60)
    	{
    		return s1;
    	}
    	if(subject1Marks > 60)
    	{
    		if(subject2Marks>60 || subject3Marks>60)
    		{
    			return s2;
    		}
    	}
    	else if(subject2Marks>60 && subject3Marks>60)
    	{
    		return s2;
    	}
    	return s3;
    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultDeclaration rd = new ResultDeclaration();
		double s1,s2,s3;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();

		System.out.println(rd.declareResults(s1, s2, s3));
		

	}

}
