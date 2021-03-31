package Assn4;

import java.io.InputStream;
import java.util.Scanner;

interface operation{
	double temp(double a, double b);
}
public class Assignment4Q1 {
		public double addition(int num1,int num2)
		{
			operation add=(a,b)-> a+b;
			return add.temp(num1,num2);
		}
		public double subtraction(int num1,int num2){
			operation sub=(a,b)-> a-b;
			return sub.temp(num1,num2);
		}
		public double multiplication(int num1,int num2){
			operation mul=(a,b)-> a*b;
			return mul.temp(num1,num2);
		}
		public double division(int num1,int num2){
			operation div=(a,b)-> {
				if(b==0) return 0;
				return a/b;
			};
			return div.temp(num1,num2);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			Assignment4Q1 as = new Assignment4Q1();
			System.out.println(as.addition(num1, num2));
			System.out.println(as.subtraction(num1, num2));
			System.out.println(as.multiplication(num1, num2));
			System.out.println(as.division(num1, num2));
	}
}