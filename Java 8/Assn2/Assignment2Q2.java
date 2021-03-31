package Assn2;
import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return incentive+salary;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return overtime+salary;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
    	int s=0;
    	for(int i : employeeSalaries)
    	{
    		s=s+i;
    	}
    	return s;
    }
    public static void main(String[] args) 
    {
    	Assignment2Q2 as = new Assignment2Q2();
    	Assignment2Q2 am = new Manager();
    	Assignment2Q2 al = new Labour();
    	ArrayList<Integer> aa = new ArrayList<>();
    	int salary = as.salary;
    	aa.add(am.getSalary(salary));
    	aa.add(al.getSalary(salary));
    	System.out.println(as.totalEmployeesSalary(aa));
    	
    	
    }
}
